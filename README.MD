<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->
**Table of Contents**  *generated with [DocToc](https://github.com/thlorenz/doctoc)*

- [common ui](#common-ui)
- [module](#module)
  - [order](#order)
- [api](#api)
- [db](#db)
- [env](#env)
- [dependency](#dependency)
  - [dep-db](#dep-db)
  - [dep-redis](#dep-redis)
  - [dep-task](#dep-task)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->

# change dumper
网盟电商通用用户交互系统

# module
## order
*dumper-base*: 1

*dumper-es*: 2

*dumper-redis*: 3

*dumper-biz*: 4

*dumper-task*: 5

# api
[sns](http://gitlab.baidu.com/wm/comment/blob/master/sns.md)

# db
[table](http://gitlab.baidu.com/wm/comment/blob/master/table.md)

# env
打包，使用deploy.sh。参数可通过sh deploy.sh -h查看，一般打包如下:

开发包
```

sh deploy.sh dev
```

测试包
```
sh deploy.sh qa
```

沙盒包
```
sh deploy.sh sb
```

上线包
```
sh deploy.sh online
```

# dependency
下面以开发环境为例，如果是qa/sandbox/online环境，修改conf下对应的目录

## dep-db
```
common-ui-db/src/main/conf/dev/data.xml
common-ui-db/src/main/conf/dev/mgmt.xml
```

## dep-redis
```
common-ui-redis/src/main/conf/dev/common-redis.properties
```

## dep-task
```
common-ui-task/src/main/conf/dev/common-task.properties
```