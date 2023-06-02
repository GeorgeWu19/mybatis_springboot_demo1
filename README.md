### 第一步
导入数据库,修改数据库配置
```sql
CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `user` (`id`, `username`, `password`) VALUES
(1, 'asin', '123456'),
(2, 'fancy', 'fancy'),
(100, 'root', 'root_password');
```

### 第二步
运行springboot

### 第三步 
执行  
>http://localhost:8080/findall
>http://localhost:8080/findByid
>http://localhost:8080/addUser
>http://localhost:8080/deleteUserById
>http://localhost:8080/updateUser





