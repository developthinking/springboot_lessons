chapter21
    SpringBoot项目中的全局异常处理

    全局异常处理不管对于API项目还是普通管理项目都是核心的部分，如果项目中遇到运行时异常，总不能每个异常处理都去添加try catch逻辑。
    在SpringBoot项目中跟SpringMVC的全局异常配置是一样的，下面我们来为API项目配置全局异常并且返回相同格式的JSON字符串。

    本章目标
    基于SpringBoot项目配置全局异常处理并且返回固定的JSON字符串