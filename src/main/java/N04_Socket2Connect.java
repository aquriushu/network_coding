
public class N04_Socket2Connect {

    /**
     * 服务端准备连接过程
     * 1，创建套接字。买一个座机电话
     * int socket(int domain, int type, int protocol)
     * domain: PF_INET, PF_INET6, PF_LOCAL
     * type:
     *  SOCK_STREAM: 字节流，对应TCP；
     *  SOCK_DGRAM: 数据报，对应UDP；
     *  SOCK_RAW: 原始套接字。
     * protocol: 废弃，设置为0。
     *
     * 2，绑定(bind)。电信局登记自己的电话号码
     * bind(int fd, sockaddr * addr, socklen_t len)可理解为
     * bind(int fd, void * addr, socklen_t len)，实际使用为强转，如下 ：
     *  struct sockaddr_in name;
     *  bind(sock,(struct sockaddr *) &name, sizeof(name));
     *
     * 3，监听(listen)。接上电话线
     * int listen(int socketfd, int backlog)
     * 步骤一创建的socket为主动类型，可发起请求。调用listen函数之后，将“主动”转换为“被动”，用于等待请求。
     *  socketfd: 套接字描述符；
     *  backlog: 已完成连接，未accept的队列大小。该值决定可接收的并发数目，值越大，理论并发数越大。
     *
     * 4，接收(accept)。操作系统内核与应用程序之间的桥梁。铃声响起
     * int accept(int listensockfd, struct sockaddr *cliaddr, socklen_t *addrlen)
     */

    /**
     * 客户端发起连接过程
     * 1，同服务端，创建套接字。
     * 2，connect。
     */


}
