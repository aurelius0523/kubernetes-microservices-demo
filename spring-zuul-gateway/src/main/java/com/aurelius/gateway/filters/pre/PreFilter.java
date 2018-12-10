package com.aurelius.gateway.filters.pre;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class PreFilter extends ZuulFilter {

    @Override
    public String filterType() {
	return "pre";
    }

    public boolean shouldFilter() {
	return true;
    }

    @Override
    public int filterOrder() {
	return 1;
    }

    public Object run() throws ZuulException {
	RequestContext ctx = RequestContext.getCurrentContext();
	HttpServletRequest request = ctx.getRequest();

	System.out.println(String.format("%s request to %s", request.getMethod(), request.getRequestURL()
	    .toString()));

	return null;
    }

}
