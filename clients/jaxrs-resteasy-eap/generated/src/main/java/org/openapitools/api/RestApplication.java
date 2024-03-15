package org.openapitools.api;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.Set;
import java.util.HashSet;

import org.openapitools.api.impl.AdAccountsApiServiceImpl;
import org.openapitools.api.impl.BoardsApiServiceImpl;
import org.openapitools.api.impl.CatalogsApiServiceImpl;
import org.openapitools.api.impl.IntegrationsApiServiceImpl;
import org.openapitools.api.impl.MediaApiServiceImpl;
import org.openapitools.api.impl.OauthApiServiceImpl;
import org.openapitools.api.impl.PinsApiServiceImpl;
import org.openapitools.api.impl.ResourcesApiServiceImpl;
import org.openapitools.api.impl.SearchApiServiceImpl;
import org.openapitools.api.impl.TermsApiServiceImpl;
import org.openapitools.api.impl.TrendsApiServiceImpl;
import org.openapitools.api.impl.UserAccountApiServiceImpl;
import org.openapitools.api.impl.UsersApiServiceImpl;

@ApplicationPath("/v5")
public class RestApplication extends Application {


    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(AdAccountsApiServiceImpl.class);
        resources.add(BoardsApiServiceImpl.class);
        resources.add(CatalogsApiServiceImpl.class);
        resources.add(IntegrationsApiServiceImpl.class);
        resources.add(MediaApiServiceImpl.class);
        resources.add(OauthApiServiceImpl.class);
        resources.add(PinsApiServiceImpl.class);
        resources.add(ResourcesApiServiceImpl.class);
        resources.add(SearchApiServiceImpl.class);
        resources.add(TermsApiServiceImpl.class);
        resources.add(TrendsApiServiceImpl.class);
        resources.add(UserAccountApiServiceImpl.class);
        resources.add(UsersApiServiceImpl.class);

        return resources;
    }




}