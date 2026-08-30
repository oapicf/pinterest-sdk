package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.Catalog;
import com.prokarma.pkmst.model.CatalogCreate;
import com.prokarma.pkmst.model.CatalogsAvailableFilterValues;
import com.prokarma.pkmst.model.CatalogsList200Response;
import com.prokarma.pkmst.model.CatalogsLocale;
import com.prokarma.pkmst.model.Country;
import com.prokarma.pkmst.model.PinterestLibError;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implementation
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Controller
public class CatalogsApiController implements CatalogsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public CatalogsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<CatalogsAvailableFilterValues> catalogsAvailableFilterValues(@ApiParam(value = "Filter entities for a given catalog_id.", required = true)  @RequestParam(value = "catalog_id", required = true) String catalogId,
        @ApiParam(value = "Filter entities for a given feed_id. If not given, all feeds are considered.")  @RequestParam(value = "feed_id", required = false) String feedId,
        @ApiParam(value = "Country for the Catalogs Items", allowableValues = "AD, AE, AF, AG, AI, AL, AM, AO, AQ, AR, AS, AT, AU, AW, AX, AZ, BA, BB, BD, BE, BF, BG, BH, BI, BJ, BL, BM, BN, BO, BQ, BR, BS, BT, BV, BW, BY, BZ, CA, CC, CD, CF, CG, CH, CI, CK, CL, CM, CN, CO, CR, CU, CV, CW, CX, CY, CZ, DE, DJ, DK, DM, DO, DZ, EC, EE, EG, EH, ER, ES, ET, FI, FJ, FK, FM, FO, FR, GA, GB, GD, GE, GF, GG, GH, GI, GL, GM, GN, GP, GQ, GR, GS, GT, GU, GW, GY, HK, HM, HN, HR, HT, HU, ID, IE, IL, IM, IN, IO, IQ, IR, IS, IT, JE, JM, JO, JP, KE, KG, KH, KI, KM, KN, KR, KW, KY, KZ, LA, LB, LC, LI, LK, LR, LS, LT, LU, LV, LY, MA, MC, MD, ME, MF, MG, MH, MK, ML, MM, MN, MO, MP, MQ, MR, MS, MT, MU, MV, MW, MX, MY, MZ, NA, NC, NE, NF, NG, NI, NL, false, NP, NR, NU, NZ, OM, PA, PE, PF, PG, PH, PK, PL, PM, PN, PR, PS, PT, PW, PY, QA, RE, RO, RS, RU, RW, SA, SB, SC, SD, SE, SG, SH, SI, SJ, SK, SL, SM, SN, SO, SR, SS, ST, SV, SX, SY, SZ, TC, TD, TF, TG, TH, TJ, TK, TL, TM, TN, TO, TR, TT, TV, TW, TZ, UA, UG, UM, US, UY, UZ, VA, VC, VE, VG, VI, VN, VU, WF, WS, YE, YT, ZA, ZM, ZW")  @RequestParam(value = "country", required = false) Country country,
        @ApiParam(value = "Language for the Catalogs Items", allowableValues = "af-ZA, ar-SA, bg-BG, bn-IN, cs-CZ, da-DK, de, el-GR, en-AU, en-CA, en-GB, en-IN, en-US, es-419, es-AR, es-ES, es-MX, fi-FI, fr, fr-CA, he-IL, hi-IN, hr-HR, hu-HU, id-ID, it, ja, ko-KR, ms-MY, nb-NO, nl, pl-PL, pt-BR, pt-PT, ro-RO, ru-RU, sk-SK, sv-SE, te-IN, th-TH, tl-PH, tr, uk-UA, vi-VN, zh-CN, zh-TW")  @RequestParam(value = "language", required = false) CatalogsLocale language,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsAvailableFilterValues>(objectMapper.readValue("", CatalogsAvailableFilterValues.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsAvailableFilterValues>(objectMapper.readValue("", CatalogsAvailableFilterValues.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsAvailableFilterValues>(objectMapper.readValue("", CatalogsAvailableFilterValues.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsAvailableFilterValues>(objectMapper.readValue("", CatalogsAvailableFilterValues.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsAvailableFilterValues>(objectMapper.readValue("", CatalogsAvailableFilterValues.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsAvailableFilterValues>(objectMapper.readValue("", CatalogsAvailableFilterValues.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsAvailableFilterValues>(objectMapper.readValue("", CatalogsAvailableFilterValues.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsAvailableFilterValues>(HttpStatus.OK);
    }

    public ResponseEntity<Catalog> catalogsCreate(@ApiParam(value = "" ,required=true )   @RequestBody CatalogCreate catalogCreate,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Catalog>(objectMapper.readValue("", Catalog.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Catalog>(objectMapper.readValue("", Catalog.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Catalog>(objectMapper.readValue("", Catalog.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Catalog>(objectMapper.readValue("", Catalog.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Catalog>(objectMapper.readValue("", Catalog.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Catalog>(objectMapper.readValue("", Catalog.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Catalog>(objectMapper.readValue("", Catalog.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Catalog>(objectMapper.readValue("", Catalog.class), HttpStatus.OK);
        }

        return new ResponseEntity<Catalog>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsList200Response> catalogsList(@ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsList200Response>(objectMapper.readValue("", CatalogsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsList200Response>(objectMapper.readValue("", CatalogsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsList200Response>(objectMapper.readValue("", CatalogsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsList200Response>(objectMapper.readValue("", CatalogsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsList200Response>(objectMapper.readValue("", CatalogsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsList200Response>(objectMapper.readValue("", CatalogsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsList200Response>(objectMapper.readValue("", CatalogsList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsList200Response>(HttpStatus.OK);
    }

}
