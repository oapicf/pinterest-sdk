package org.openapitools.api.consumer;

import org.openapitools.model.BrandAccount;
import org.openapitools.model.BrandAccountCreate;
import org.openapitools.model.BrandAccountUpdate;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.BusinessAccessService;
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
@RequestMapping("/business_access")
public class BusinessAccessServiceController {

    @DubboReference
    private BusinessAccessService businessAccessService;

    @RequestMapping(method = RequestMethod.POST, value = "/business_hierarchy/{business_hierarchy_id}/brand_accounts")
    public BrandAccount brandAccountsCreate(
        @RequestParam(name = "businessHierarchyId") String businessHierarchyId,
        @RequestParam(name = "brandAccountCreate") BrandAccountCreate brandAccountCreate
    ) {
        return businessAccessService.brandAccountsCreate(businessHierarchyId, brandAccountCreate);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}")
    public BrandAccount brandAccountsUpdate(
        @RequestParam(name = "brandAccountId") String brandAccountId,
        @RequestParam(name = "businessHierarchyId") String businessHierarchyId,
        @RequestParam(name = "brandAccountUpdate") BrandAccountUpdate brandAccountUpdate
    ) {
        return businessAccessService.brandAccountsUpdate(brandAccountId, businessHierarchyId, brandAccountUpdate);
    }
}
