package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.Error;
import com.prokarma.pkmst.model.MediaList200Response;
import com.prokarma.pkmst.model.MediaUpload;
import com.prokarma.pkmst.model.MediaUploadDetails;
import com.prokarma.pkmst.model.MediaUploadRequest;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Controller
public class MediaApiController implements MediaApi {
    private final ObjectMapper objectMapper;
@Autowired
    public MediaApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<MediaUpload> mediaCreate(@ApiParam(value = "Create a media upload request" ,required=true )   @RequestBody MediaUploadRequest mediaUploadRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MediaUpload>(objectMapper.readValue("", MediaUpload.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MediaUpload>(objectMapper.readValue("", MediaUpload.class), HttpStatus.OK);
        }

        return new ResponseEntity<MediaUpload>(HttpStatus.OK);
    }

    public ResponseEntity<MediaUploadDetails> mediaGet(@ApiParam(value = "Media identifier",required=true ) @PathVariable("media_id") String mediaId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MediaUploadDetails>(objectMapper.readValue("", MediaUploadDetails.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MediaUploadDetails>(objectMapper.readValue("", MediaUploadDetails.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MediaUploadDetails>(objectMapper.readValue("", MediaUploadDetails.class), HttpStatus.OK);
        }

        return new ResponseEntity<MediaUploadDetails>(HttpStatus.OK);
    }

    public ResponseEntity<MediaList200Response> mediaList(@ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MediaList200Response>(objectMapper.readValue("", MediaList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MediaList200Response>(objectMapper.readValue("", MediaList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<MediaList200Response>(HttpStatus.OK);
    }

}
