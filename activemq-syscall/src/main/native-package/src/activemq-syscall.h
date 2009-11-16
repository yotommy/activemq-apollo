#ifndef INCLUDED_ACTIVEMQ_SYSCALL_H
#define INCLUDED_ACTIVEMQ_SYSCALL_H

#ifdef HAVE_CONFIG_H
  /* configure based build.. we will use what it discovered about the platform */
  #include "config.h"
#else
  #ifdef WIN32
    /* Windows based build */
    #define HAVE_STDLIB_H 1
    #define HAVE_STRINGS_H 1
  #endif
#endif

#ifdef HAVE_UNISTD_H
  #include <unistd.h>
#endif

#ifdef HAVE_STDLIB_H
  #include <stdlib.h>
#endif

#ifdef HAVE_STRINGS_H
  #include <string.h>
#endif

#ifdef HAVE_AIO_H
  #include <aio.h>
#endif

#ifdef HAVE_SYS_ERRNO_H
  #include <sys/errno.h>
#endif

#include <fcntl.h>
#endif /* INCLUDED_ACTIVEMQ_SYSCALL_H */