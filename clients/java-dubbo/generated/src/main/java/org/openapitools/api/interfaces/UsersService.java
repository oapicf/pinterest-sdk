package org.openapitools.api.interfaces;

import org.openapitools.model.PinterestLibError;
import org.openapitools.model.UserAccountFollowedInterests200Response;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface UsersService {

    /**
     * List following interests
     * Get a list of a user&#39;s following interests in one place.
     *
     * @param username A valid username (required)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return UserAccountFollowedInterests200Response
     */
    UserAccountFollowedInterests200Response userAccountFollowedInterests(
        String username,
        String bookmark,
        Integer pageSize
    );
}
