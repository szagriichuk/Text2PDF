package com.google.text2pdf.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;

/**
 * @author sergiizagriichuk
 */
public class LoggerFacade implements Logger {

    private Logger logger;

    private LoggerFacade(String name) {
        logger = LoggerFactory.getLogger(name);
    }

    private LoggerFacade(Class<?> clazz) {
        logger = LoggerFactory.getLogger(clazz);
    }

    public static LoggerFacade getLogger(String name) {
        return new LoggerFacade(name);
    }

    public static LoggerFacade getLogger(Class<?> clazz) {
        return new LoggerFacade(clazz);
    }

    @Override
    public String getName() {
        return logger.getName();
    }

    @Override
    public boolean isTraceEnabled() {
        return logger.isTraceEnabled();
    }

    @Override
    public void trace(String msg) {
        if (logger.isTraceEnabled())
            logger.trace(msg);
    }

    @Override
    public void trace(String format, Object arg) {
        if (logger.isTraceEnabled())
            logger.trace(format, arg);
    }

    @Override
    public void trace(String format, Object arg1, Object arg2) {
        if (logger.isTraceEnabled())
            logger.trace(format, arg1, arg2);
    }

    @Override
    public void trace(String format, Object[] argArray) {
        if (logger.isTraceEnabled())
            logger.trace(format, argArray);
    }

    @Override
    public void trace(String msg, Throwable t) {
        if (logger.isTraceEnabled())
            logger.trace(msg, t);
    }

    @Override
    public boolean isTraceEnabled(Marker marker) {
        return logger.isTraceEnabled(marker);
    }

    @Override
    public void trace(Marker marker, String msg) {
        if (logger.isTraceEnabled(marker))
            logger.trace(marker, msg);
    }

    @Override
    public void trace(Marker marker, String format, Object arg) {
        if (logger.isTraceEnabled(marker))
            logger.trace(marker, format, arg);
    }

    @Override
    public void trace(Marker marker, String format, Object arg1, Object arg2) {
        if (logger.isTraceEnabled(marker))
            logger.trace(marker, format, arg1, arg2);
    }

    @Override
    public void trace(Marker marker, String format, Object[] argArray) {
        if (logger.isTraceEnabled(marker))
            logger.trace(marker, format, argArray);
    }

    @Override
    public void trace(Marker marker, String msg, Throwable t) {
        if (logger.isTraceEnabled(marker))
            logger.trace(marker, msg);
    }

    @Override
    public boolean isDebugEnabled() {
        return logger.isDebugEnabled();
    }

    @Override
    public void debug(String msg) {
        if (logger.isDebugEnabled())
            logger.debug(msg);
    }

    @Override
    public void debug(String format, Object arg) {
        if (logger.isDebugEnabled())
            logger.debug(format, arg);
    }

    @Override
    public void debug(String format, Object arg1, Object arg2) {
        if (logger.isDebugEnabled())
            logger.debug(format, arg1, arg2);
    }

    @Override
    public void debug(String format, Object[] argArray) {
        if (logger.isDebugEnabled())
            logger.debug(format, argArray);
    }

    @Override
    public void debug(String msg, Throwable t) {
        if (logger.isDebugEnabled())
            logger.debug(msg, t);
    }

    @Override
    public boolean isDebugEnabled(Marker marker) {
        return logger.isDebugEnabled(marker);
    }

    @Override
    public void debug(Marker marker, String msg) {
        if (logger.isDebugEnabled(marker))
            logger.debug(marker, msg);
    }

    @Override
    public void debug(Marker marker, String format, Object arg) {
        if (logger.isDebugEnabled(marker))
            logger.debug(marker, format, arg);
    }

    @Override
    public void debug(Marker marker, String format, Object arg1, Object arg2) {
        if (logger.isDebugEnabled(marker))
            logger.debug(marker, format, arg1, arg2);
    }

    @Override
    public void debug(Marker marker, String format, Object[] argArray) {
        if (logger.isDebugEnabled(marker))
            logger.debug(marker, format, argArray);
    }

    @Override
    public void debug(Marker marker, String msg, Throwable t) {
        if (logger.isDebugEnabled(marker))
            logger.debug(marker, msg, t);
    }

    @Override
    public boolean isInfoEnabled() {
        return logger.isInfoEnabled();
    }

    @Override
    public void info(String msg) {
        if (logger.isInfoEnabled())
            logger.info(msg);
    }

    @Override
    public void info(String format, Object arg) {
        if (logger.isInfoEnabled())
            logger.info(format, arg);
    }

    @Override
    public void info(String format, Object arg1, Object arg2) {
        if (logger.isInfoEnabled())
            logger.info(format, arg1, arg2);
    }

    @Override
    public void info(String format, Object[] argArray) {
        if (logger.isInfoEnabled())
            logger.info(format, argArray);
    }

    @Override
    public void info(String msg, Throwable t) {
        if (logger.isInfoEnabled())
            logger.info(msg, t);
    }

    @Override
    public boolean isInfoEnabled(Marker marker) {
        return logger.isInfoEnabled(marker);
    }

    @Override
    public void info(Marker marker, String msg) {
        if (logger.isInfoEnabled(marker))
            logger.info(marker, msg);
    }

    @Override
    public void info(Marker marker, String format, Object arg) {
        if (logger.isInfoEnabled(marker))
            logger.info(marker, format, arg);
    }

    @Override
    public void info(Marker marker, String format, Object arg1, Object arg2) {
        if (logger.isInfoEnabled(marker))
            logger.info(marker, format, arg1, arg2);
    }

    @Override
    public void info(Marker marker, String format, Object[] argArray) {
        if (logger.isInfoEnabled(marker))
            logger.info(marker, format, argArray);
    }

    @Override
    public void info(Marker marker, String msg, Throwable t) {
        if (logger.isInfoEnabled(marker))
            logger.info(marker, msg, t);
    }

    @Override
    public boolean isWarnEnabled() {
        return logger.isWarnEnabled();
    }

    @Override
    public void warn(String msg) {
        if (logger.isWarnEnabled())
            logger.warn(msg);
    }

    @Override
    public void warn(String format, Object arg) {
        if (logger.isWarnEnabled())
            logger.warn(format, arg);
    }

    @Override
    public void warn(String format, Object[] argArray) {
        if (logger.isWarnEnabled())
            logger.warn(format, argArray);
    }

    @Override
    public void warn(String format, Object arg1, Object arg2) {
        if (logger.isWarnEnabled())
            logger.warn(format, arg1, arg2);
    }

    @Override
    public void warn(String msg, Throwable t) {
        if (logger.isWarnEnabled())
            logger.warn(msg, t);
    }

    @Override
    public boolean isWarnEnabled(Marker marker) {
        return logger.isWarnEnabled(marker);
    }

    @Override
    public void warn(Marker marker, String msg) {
        if (logger.isWarnEnabled(marker))
            logger.warn(marker, msg);
    }

    @Override
    public void warn(Marker marker, String format, Object arg) {
        if (logger.isWarnEnabled(marker))
            logger.warn(marker, format, arg);
    }

    @Override
    public void warn(Marker marker, String format, Object arg1, Object arg2) {
        if (logger.isWarnEnabled(marker))
            logger.warn(marker, format, arg1, arg2);
    }

    @Override
    public void warn(Marker marker, String format, Object[] argArray) {
        if (logger.isWarnEnabled(marker))
            logger.warn(marker, format, argArray);
    }

    @Override
    public void warn(Marker marker, String msg, Throwable t) {
        if (logger.isWarnEnabled(marker))
            logger.warn(marker, msg, t);
    }

    @Override
    public boolean isErrorEnabled() {
        return logger.isErrorEnabled();
    }

    @Override
    public void error(String msg) {
        if (logger.isErrorEnabled())
            logger.error(msg);
    }

    @Override
    public void error(String format, Object arg) {
        if (logger.isErrorEnabled())
            logger.error(format, arg);
    }

    @Override
    public void error(String format, Object arg1, Object arg2) {
        if (logger.isErrorEnabled())
            logger.error(format, arg1, arg2);
    }

    @Override
    public void error(String format, Object[] argArray) {
        if (logger.isErrorEnabled())
            logger.error(format, argArray);
    }

    @Override
    public void error(String msg, Throwable t) {
        if (logger.isErrorEnabled())
            logger.error(msg, t);
    }

    @Override
    public boolean isErrorEnabled(Marker marker) {
        return logger.isErrorEnabled(marker);
    }

    @Override
    public void error(Marker marker, String msg) {
        if (logger.isErrorEnabled(marker))
            logger.error(marker, msg);
    }

    @Override
    public void error(Marker marker, String format, Object arg) {
        if (logger.isErrorEnabled(marker))
            logger.error(marker, format, arg);
    }

    @Override
    public void error(Marker marker, String format, Object arg1, Object arg2) {
        if (logger.isErrorEnabled(marker))
            logger.error(marker, format, arg1, arg2);
    }

    @Override
    public void error(Marker marker, String format, Object[] argArray) {
        if (logger.isErrorEnabled(marker))
            logger.error(marker, format, argArray);
    }

    @Override
    public void error(Marker marker, String msg, Throwable t) {
        if (logger.isErrorEnabled(marker))
            logger.error(marker, msg, t);
    }
}
