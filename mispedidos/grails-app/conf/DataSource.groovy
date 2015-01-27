dataSource {
    pooled = true
    driverClassName = "org.h2.Driver"
    username = "sa"
    password = ""
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
            url = "jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:h2:mem:testDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
        }
    }
    production {
        dataSource {
			dbCreate = "update"
			driverClassName = 'com.mysql.jdbc.Driver'
			String host = System.getenv('OPENSHIFT_MYSQL_DB_HOST')
			String port = System.getenv('OPENSHIFT_MYSQL_DB_PORT')
			String dbName = System.getenv('OPENSHIFT_APP_NAME')
			url = "jdbc:mysql://$host:$port/$dbName"
		
			driverClassName = "com.mysql.jdbc.Driver"
			dialect = org.hibernate.dialect.MySQL5InnoDBDialect
			username = System.getenv('OPENSHIFT_MYSQL_DB_USERNAME')
			password = System.getenv('OPENSHIFT_MYSQL_DB_PASSWORD')
			pooled = true
            properties {
               maxActive = -1
               minEvictableIdleTimeMillis=1800000
               timeBetweenEvictionRunsMillis=1800000
               numTestsPerEvictionRun=3
               testOnBorrow=true
               testWhileIdle=true
               testOnReturn=true
               validationQuery="SELECT 1"
            }
        }
    }
}
