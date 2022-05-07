package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-07T10:48:11.625089Z[Etc/UTC]")
@Controller
@RequestMapping("${openapi.pinterestREST.base-path:/v5}")
public class UserAccountApiController implements UserAccountApi {

    private final NativeWebRequest request;

    @Autowired
    public UserAccountApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
