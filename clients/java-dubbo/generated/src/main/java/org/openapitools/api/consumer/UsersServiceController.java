package org.openapitools.api.consumer;

import org.openapitools.model.PinterestLibError;
import org.openapitools.model.UserAccountFollowedInterests200Response;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.UsersService;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

@RestController
@RequestMapping("/users")
public class UsersServiceController {

    @DubboReference
    private UsersService usersService;

    @RequestMapping(method = RequestMethod.GET, value = "/{username}/interests/follow")
    public UserAccountFollowedInterests200Response userAccountFollowedInterests(
        @RequestParam(name = "username") String username,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return usersService.userAccountFollowedInterests(username, bookmark, pageSize);
    }
}
