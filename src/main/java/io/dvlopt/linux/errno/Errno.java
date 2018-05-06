package io.dvlopt.linux.errno ;




/**
 * Errno codes made more type-safe for the JVM.
 */
public enum Errno {


    /**
     * Operation not permitted.
     */
    EPERM( 1 ) ,

    /**
     * No such file or directory.
     */
    ENOENT( 2 ) ,

    /**
     * No such process.
     */
    ESRCH( 3 ) ,

    /**
     * Interrupted system call.
     */
    EINTR( 4 ) ,

    /**
     * Input/output error.
     */
    EIO( 5 ) ,

    /**
     * No such device or address.
     */
    ENXIO( 6 ) ,

    /**
     * Argument list too long.
     */
    E2BIG( 7 ) ,

    /**
     * Exec format error.
     */
    ENOEXEC( 8 ) ,

    /**
     * Bad file descriptor.
     */
    EBADF( 9 ) ,

    /**
     * No child processes.
     */
    ECHILD( 10 ) ,

    /**
     * Resource temporarily unavailable (same code as EWOULDBLOCK).
     */
    EAGAIN( 11 ) ,

    /**
     * Cannot allocate memory.
     */
    ENOMEM( 12 ) ,

    /**
     * Permission denied.
     */
    EACCES( 13 ) ,

    /**
     * Bad address.
     */
    EFAULT( 14 ) ,

    /**
     * Block device required.
     */
    ENOTBLK( 15 ) ,

    /**
     * Device or resource busy.
     */
    EBUSY( 16 ) ,

    /**
     * File exists.
     */
    EEXIST( 17 ) ,

    /**
     * Invalid cross-device link.
     */
    EXDEV( 18 ) ,

    /**
     * No such device.
     */
    ENODEV( 19 ) ,

    /**
     * Not a directory.
     */
    ENOTDIR( 20 ) ,

    /**
     * Is a directory.
     */
    EISDIR( 21 ) ,

    /**
     * Invalid argument.
     */
    EINVAL( 22 ) ,

    /**
     * Too many open files in system.
     */
    ENFILE( 23 ) ,

    /**
     * Too many open files.
     */
    EMFILE( 24 ) ,

    /**
     * Inappropriate ioctl for device.
     */
    ENOTTY( 25 ) ,

    /**
     * Text file busy.
     */
    ETXTBSY( 26 ) ,

    /**
     * File too large.
     */
    EFBIG( 27 ) ,

    /**
     * No space left on device.
     */
    ENOSPC( 28 ) ,

    /**
     * Illegal seek.
     */
    ESPIPE( 29 ) ,

    /**
     * Read-only file system.
     */
    EROFS( 30 ) ,

    /**
     * Too many links.
     */
    EMLINK( 31 ) ,

    /**
     * Broken pipe.
     */
    EPIPE( 32 ) ,

    /**
     * Numerical argument out of domain.
     */
    EDOM( 33 ) ,

    /**
     * Numerical result out of range.
     */
    ERANGE( 34 ) ,

    /**
     * Resource deadlock avoided.
     */
    EDEADLK( 35 ) ,

    /**
     * File name too long.
     */
    ENAMETOOLONG( 36 ) ,

    /**
     * No locks available.
     */
    ENOLCK( 37 ) ,

    /**
     * Function not implemented.
     */
    ENOSYS( 38 ) ,

    /**
     * Directory not empty.
     */
    ENOTEMPTY( 39 ) ,

    /**
     * Too many levels of symbolic links.
     */
    ELOOP( 40 ) ,

    /**
     * Resource temporarily unavailable (same code as EAGAIN).
     */
    EWOULDBLOCK( 11 ) ,

    /**
     * No message of desired type.
     */
    ENOMSG( 42 ) ,

    /**
     * Identifier removed.
     */
    EIDRM( 43 ) ,

    /**
     * Channel number out of range.
     */
    ECHRNG( 44 ) ,

    /**
     * Level 2 not synchronized.
     */
    EL2NSYNC( 45 ) ,

    /**
     * Level 3 halted.
     */
    EL3HLT( 46 ) ,

    /**
     * Level 3 reset.
     */
    EL3RST( 47 ) ,

    /**
     * Link number out of range.
     */
    ELNRNG( 48 ) ,

    /**
     * Protocol driver not attached.
     */
    EUNATCH( 49 ) ,

    /**
     * No CSI structure available.
     */
    ENOCSI( 50 ) ,

    /**
     * Level 2 halted.
     */
    EL2HLT( 51 ) ,

    /**
     * Invalid exchange.
     */
    EBADE( 52 ) ,

    /**
     * Invalid request descriptor.
     */
    EBADR( 53 ) ,

    /**
     * Exchange full.
     */
    EXFULL( 54 ) ,

    /**
     * No anode.
     */
    ENOANO( 55 ) ,

    /**
     * Invalid request code.
     */
    EBADRQC( 56 ) ,

    /**
     * Invalid slot.
     */
    EBADSLT( 57 ) ,

    /**
     * Bad font file format.
     */
    EBFONT( 59 ) ,

    /**
     * Device not a stream.
     */
    ENOSTR( 60 ) ,

    /**
     * No data available.
     */
    ENODATA( 61 ) ,

    /**
     * Timer expired.
     */
    ETIME( 62 ) ,

    /**
     * Out of streams resources.
     */
    ENOSR( 63 ) ,

    /**
     * Machine is not on the network.
     */
    ENONET( 64 ) ,

    /**
     * Package not installed.
     */
    ENOPKG( 65 ) ,

    /**
     * Object is remote.
     */
    EREMOTE( 66 ) ,

    /**
     * Link has been severed.
     */
    ENOLINK( 67 ) ,

    /**
     * Advertise error.
     */
    EADV( 68 ) ,

    /**
     * Srmount error.
     */
    ESRMNT( 69 ) ,

    /**
     * Communication error on send.
     */
    ECOMM( 70 ) ,

    /**
     * Protocol error.
     */
    EPROTO( 71 ) ,

    /**
     * Multihop attempted.
     */
    EMULTIHOP( 72 ) ,

    /**
     * RFS specific error.
     */
    EDOTDOT( 73 ) ,

    /**
     * Bad message.
     */
    EBADMSG( 74 ) ,

    /**
     * Value too large for defined data type.
     */
    EOVERFLOW( 75 ) ,

    /**
     * Name not unique on network.
     */
    ENOTUNIQ( 76 ) ,

    /**
     * File descriptor in bad state.
     */
    EBADFD( 77 ) ,

    /**
     * Remote address changed.
     */
    EREMCHG( 78 ) ,

    /**
     * Can not access a needed shared library.
     */
    ELIBACC( 79 ) ,

    /**
     * Accessing a corrupted shared library.
     */
    ELIBBAD( 80 ) ,

    /**
     * .lib section in a.out corrupted.
     */
    ELIBSCN( 81 ) ,

    /**
     * Attempting to link in too many shared libraries.
     */
    ELIBMAX( 82 ) ,

    /**
     * Cannot exec a shared library directly.
     */
    ELIBEXEC( 83 ) ,

    /**
     * Invalid or incomplete multibyte or wide character.
     */
    EILSEQ( 84 ) ,

    /**
     * Interrupted system call should be restarted.
     */
    ERESTART( 85 ) ,

    /**
     * Streams pipe error.
     */
    ESTRPIPE( 86 ) ,

    /**
     * Too many users.
     */
    EUSERS( 87 ) ,

    /**
     * Socket operation on non-socket.
     */
    ENOTSOCK( 88 ) ,

    /**
     * Destination address required.
     */
    EDESTADDRREQ( 89 ) ,

    /**
     * Message too long.
     */
    EMSGSIZE( 90 ) ,

    /**
     * Protocol wrong type for socket.
     */
    EPROTOTYPE( 91 ) ,

    /**
     * Protocol not available.
     */
    ENOPROTOOPT( 92 ) ,

    /**
     * Protocol not supported.
     */
    EPROTONOSUPPORT( 93 ) ,

    /**
     * Socket type not supported.
     */
    ESOCKTNOSUPPORT( 94 ) ,

    /**
     * Operation not supported.
     */
    EOPNOTSUPP( 95 ) ,

    /**
     * Protocol family not supported.
     */
    EPFNOSUPPORT( 96 ) ,

    /**
     * Address family not supported by protocol.
     */
    EAFNOSUPPORT( 97 ) ,

    /**
     * Address already in use.
     */
    EADDRINUSE( 98 ) ,

    /**
     * Cannot assign requested address.
     */
    EADDRNOTAVAIL( 99 ) ,

    /**
     * Network is down.
     */
    ENETDOWN( 100 ) ,

    /**
     * Network is unreachable.
     */
    ENETUNREACH( 101 ) ,

    /**
     * Network dropped connection on reset.
     */
    ENETRESET( 102 ) ,

    /**
     * Software caused connection abort.
     */
    ECONNABORTED( 103 ) ,

    /**
     * Connection reset by peer.
     */
    ECONNRESET( 104 ) ,

    /**
     * No buffer space available.
     */
    ENOBUFS( 105 ) ,

    /**
     * Transport endpoint is already connected.
     */
    EISCONN( 106 ) ,

    /**
     * Transport endpoint is not connected.
     */
    ENOTCONN( 107 ) ,

    /**
     * Cannot send after transport endpoint shutdown.
     */
    ESHUTDOWN( 108 ) ,

    /**
     * Too many references: cannot splice.
     */
    ETOOMANYREFS( 109 ) ,

    /**
     * Connection timed out.
     */
    ETIMEDOUT( 110 ) ,

    /**
     * Connection refused.
     */
    ECONNREFUSED( 111 ) ,

    /**
     * Host is down.
     */
    EHOSTDOWN( 112 ) ,

    /**
     * No route to host.
     */
    EHOSTUNREACH( 113 ) ,

    /**
     * Operation already in progress.
     */
    EALREADY( 114 ) ,

    /**
     * Operation now in progress.
     */
    EINPROGRESS( 115 ) ,

    /**
     * Stale file handle.
     */
    ESTALE( 116 ) ,

    /**
     * Structure needs cleaning.
     */
    EUCLEAN( 117 ) ,

    /**
     * Not a XENIX named type file.
     */
    ENOTNAM( 118 ) ,

    /**
     * No XENIX semaphores available.
     */
    ENAVAIL( 119 ) ,

    /**
     * Is a named type file.
     */
    EISNAM( 120 ) ,

    /**
     * Remote I/O error.
     */
    EREMOTEIO( 121 ) ,

    /**
     * Disk quota exceeded.
     */
    EDQUOT( 122 ) ,

    /**
     * No medium found.
     */
    ENOMEDIUM( 123 ) ,

    /**
     * Wrong medium type.
     */
    EMEDIUMTYPE( 124 ) ,

    /**
     * Operation canceled.
     */
    ECANCELED( 125 ) ,

    /**
     * Required key not available.
     */
    ENOKEY( 126 ) ,

    /**
     * Key has expired.
     */
    EKEYEXPIRED( 127 ) ,

    /**
     * Key has been revoked.
     */
    EKEYREVOKED( 128 ) ,

    /**
     * Key was rejected by service.
     */
    EKEYREJECTED( 129 ) ,

    /**
     * Owner died.
     */
    EOWNERDEAD( 130 ) ,

    /**
     * State not recoverable.
     */
    ENOTRECOVERABLE( 131 ) ,

    /**
     * Operation not possible due to RF-kill.
     */
    ERFKILL( 132 ) ,

    /**
     * Memory page has hardware error.
     */
    EHWPOISON( 133 ) ;




    /**
     * Errno code.
     */
    public final int value ;




    private Errno( int value ) {
    
        this.value = value ;
    }




    /**
     * Converts a raw errno code value into an enum.
     *
     * @param value  Raw errno code.
     *
     * @return  An Errno enum.
     */
    public static Errno fromValue( int value ) {
    

        switch( value ) {

            case 1:   return Errno.EPERM           ;
            case 2:   return Errno.ENOENT          ;
            case 3:   return Errno.ESRCH           ;
            case 4:   return Errno.EINTR           ;
            case 5:   return Errno.EIO             ;
            case 6:   return Errno.ENXIO           ;
            case 7:   return Errno.E2BIG           ;
            case 8:   return Errno.ENOEXEC         ;
            case 9:   return Errno.EBADF           ;
            case 10:  return Errno.ECHILD          ;
            case 11:  return Errno.EAGAIN          ;
            case 12:  return Errno.ENOMEM          ;
            case 13:  return Errno.EACCES          ;
            case 14:  return Errno.EFAULT          ;
            case 15:  return Errno.ENOTBLK         ;
            case 16:  return Errno.EBUSY           ;
            case 17:  return Errno.EEXIST          ;
            case 18:  return Errno.EXDEV           ;
            case 19:  return Errno.ENODEV          ;
            case 20:  return Errno.ENOTDIR         ;
            case 21:  return Errno.EISDIR          ;
            case 22:  return Errno.EINVAL          ;
            case 23:  return Errno.ENFILE          ;
            case 24:  return Errno.EMFILE          ;
            case 25:  return Errno.ENOTTY          ;
            case 26:  return Errno.ETXTBSY         ;
            case 27:  return Errno.EFBIG           ;
            case 28:  return Errno.ENOSPC          ;
            case 29:  return Errno.ESPIPE          ;
            case 30:  return Errno.EROFS           ;
            case 31:  return Errno.EMLINK          ;
            case 32:  return Errno.EPIPE           ;
            case 33:  return Errno.EDOM            ;
            case 34:  return Errno.ERANGE          ;
            case 35:  return Errno.EDEADLK         ;
            case 36:  return Errno.ENAMETOOLONG    ;
            case 37:  return Errno.ENOLCK          ;
            case 38:  return Errno.ENOSYS          ;
            case 39:  return Errno.ENOTEMPTY       ;
            case 40:  return Errno.ELOOP           ;
            // Clashes with EAGAIN
            //
            // case 11:  return Errno.EWOULDBLOCK  ;
            case 42:  return Errno.ENOMSG          ;
            case 43:  return Errno.EIDRM           ;
            case 44:  return Errno.ECHRNG          ;
            case 45:  return Errno.EL2NSYNC        ;
            case 46:  return Errno.EL3HLT          ;
            case 47:  return Errno.EL3RST          ;
            case 48:  return Errno.ELNRNG          ;
            case 49:  return Errno.EUNATCH         ;
            case 50:  return Errno.ENOCSI          ;
            case 51:  return Errno.EL2HLT          ;
            case 52:  return Errno.EBADE           ;
            case 53:  return Errno.EBADR           ;
            case 54:  return Errno.EXFULL          ;
            case 55:  return Errno.ENOANO          ;
            case 56:  return Errno.EBADRQC         ;
            case 57:  return Errno.EBADSLT         ;
            case 59:  return Errno.EBFONT          ;
            case 60:  return Errno.ENOSTR          ;
            case 61:  return Errno.ENODATA         ;
            case 62:  return Errno.ETIME           ;
            case 63:  return Errno.ENOSR           ;
            case 64:  return Errno.ENONET          ;
            case 65:  return Errno.ENOPKG          ;
            case 66:  return Errno.EREMOTE         ;
            case 67:  return Errno.ENOLINK         ;
            case 68:  return Errno.EADV            ;
            case 69:  return Errno.ESRMNT          ;
            case 70:  return Errno.ECOMM           ;
            case 71:  return Errno.EPROTO          ;
            case 72:  return Errno.EMULTIHOP       ;
            case 73:  return Errno.EDOTDOT         ;
            case 74:  return Errno.EBADMSG         ;
            case 75:  return Errno.EOVERFLOW       ;
            case 76:  return Errno.ENOTUNIQ        ;
            case 77:  return Errno.EBADFD          ;
            case 78:  return Errno.EREMCHG         ;
            case 79:  return Errno.ELIBACC         ;
            case 80:  return Errno.ELIBBAD         ;
            case 81:  return Errno.ELIBSCN         ;
            case 82:  return Errno.ELIBMAX         ;
            case 83:  return Errno.ELIBEXEC        ;
            case 84:  return Errno.EILSEQ          ;
            case 85:  return Errno.ERESTART        ;
            case 86:  return Errno.ESTRPIPE        ;
            case 87:  return Errno.EUSERS          ;
            case 88:  return Errno.ENOTSOCK        ;
            case 89:  return Errno.EDESTADDRREQ    ;
            case 90:  return Errno.EMSGSIZE        ;
            case 91:  return Errno.EPROTOTYPE      ;
            case 92:  return Errno.ENOPROTOOPT     ;
            case 93:  return Errno.EPROTONOSUPPORT ;
            case 94:  return Errno.ESOCKTNOSUPPORT ;
            case 95:  return Errno.EOPNOTSUPP      ;
            case 96:  return Errno.EPFNOSUPPORT    ;
            case 97:  return Errno.EAFNOSUPPORT    ;
            case 98:  return Errno.EADDRINUSE      ;
            case 99:  return Errno.EADDRNOTAVAIL   ;
            case 100: return Errno.ENETDOWN        ;
            case 101: return Errno.ENETUNREACH     ;
            case 102: return Errno.ENETRESET       ;
            case 103: return Errno.ECONNABORTED    ;
            case 104: return Errno.ECONNRESET      ;
            case 105: return Errno.ENOBUFS         ;
            case 106: return Errno.EISCONN         ;
            case 107: return Errno.ENOTCONN        ;
            case 108: return Errno.ESHUTDOWN       ;
            case 109: return Errno.ETOOMANYREFS    ;
            case 110: return Errno.ETIMEDOUT       ;
            case 111: return Errno.ECONNREFUSED    ;
            case 112: return Errno.EHOSTDOWN       ;
            case 113: return Errno.EHOSTUNREACH    ;
            case 114: return Errno.EALREADY        ;
            case 115: return Errno.EINPROGRESS     ;
            case 116: return Errno.ESTALE          ;
            case 117: return Errno.EUCLEAN         ;
            case 118: return Errno.ENOTNAM         ;
            case 119: return Errno.ENAVAIL         ;
            case 120: return Errno.EISNAM          ;
            case 121: return Errno.EREMOTEIO       ;
            case 122: return Errno.EDQUOT          ;
            case 123: return Errno.ENOMEDIUM       ;
            case 124: return Errno.EMEDIUMTYPE     ;
            case 125: return Errno.ECANCELED       ;
            case 126: return Errno.ENOKEY          ;
            case 127: return Errno.EKEYEXPIRED     ;
            case 128: return Errno.EKEYREVOKED     ;
            case 129: return Errno.EKEYREJECTED    ;
            case 130: return Errno.EOWNERDEAD      ;
            case 131: return Errno.ENOTRECOVERABLE ;
            case 132: return Errno.ERFKILL         ;
            case 133: return Errno.EHWPOISON       ;
        }

        return null ;
    }
}
