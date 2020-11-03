-- `aos-center`.test_user definition  for mariadb

CREATE TABLE `test_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT 'username',
  `password` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT 'password',
  `role_name` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT 'role',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='test';