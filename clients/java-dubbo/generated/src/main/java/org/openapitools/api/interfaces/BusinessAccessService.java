package org.openapitools.api.interfaces;

import org.openapitools.model.BrandAccount;
import org.openapitools.model.BrandAccountCreate;
import org.openapitools.model.BrandAccountUpdate;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface BusinessAccessService {

    /**
     * Create a Brand Account
     * Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.
     *
     * @param businessHierarchyId business hierarchy node id (required)
     * @param brandAccountCreate  (required)
     * @return BrandAccount
     */
    BrandAccount brandAccountsCreate(
        String businessHierarchyId,
        BrandAccountCreate brandAccountCreate
    );

    /**
     * Update a Brand Account
     * Update an existing Brand Account
     *
     * @param brandAccountId  (required)
     * @param businessHierarchyId business hierarchy node id (required)
     * @param brandAccountUpdate  (required)
     * @return BrandAccount
     */
    BrandAccount brandAccountsUpdate(
        String brandAccountId,
        String businessHierarchyId,
        BrandAccountUpdate brandAccountUpdate
    );
}
