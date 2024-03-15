#' Create a new IntegrationMetadata
#'
#' @description
#' Integration metadata
#'
#' @docType class
#' @title IntegrationMetadata
#' @description IntegrationMetadata Class
#' @format An \code{R6Class} generator object
#' @field id  character [optional]
#' @field external_business_id  character [optional]
#' @field connected_merchant_id  character [optional]
#' @field connected_user_id  character [optional]
#' @field connected_advertiser_id  character [optional]
#' @field connected_lba_id  character [optional]
#' @field connected_tag_id  character [optional]
#' @field partner_access_token_expiry  numeric [optional]
#' @field partner_refresh_token_expiry  numeric [optional]
#' @field scopes  character [optional]
#' @field created_timestamp  numeric [optional]
#' @field updated_timestamp  numeric [optional]
#' @field additional_id_1  character [optional]
#' @field partner_metadata  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
IntegrationMetadata <- R6::R6Class(
  "IntegrationMetadata",
  public = list(
    `id` = NULL,
    `external_business_id` = NULL,
    `connected_merchant_id` = NULL,
    `connected_user_id` = NULL,
    `connected_advertiser_id` = NULL,
    `connected_lba_id` = NULL,
    `connected_tag_id` = NULL,
    `partner_access_token_expiry` = NULL,
    `partner_refresh_token_expiry` = NULL,
    `scopes` = NULL,
    `created_timestamp` = NULL,
    `updated_timestamp` = NULL,
    `additional_id_1` = NULL,
    `partner_metadata` = NULL,
    #' Initialize a new IntegrationMetadata class.
    #'
    #' @description
    #' Initialize a new IntegrationMetadata class.
    #'
    #' @param id id
    #' @param external_business_id external_business_id
    #' @param connected_merchant_id connected_merchant_id
    #' @param connected_user_id connected_user_id
    #' @param connected_advertiser_id connected_advertiser_id
    #' @param connected_lba_id connected_lba_id
    #' @param connected_tag_id connected_tag_id
    #' @param partner_access_token_expiry partner_access_token_expiry
    #' @param partner_refresh_token_expiry partner_refresh_token_expiry
    #' @param scopes scopes
    #' @param created_timestamp created_timestamp
    #' @param updated_timestamp updated_timestamp
    #' @param additional_id_1 additional_id_1
    #' @param partner_metadata partner_metadata
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id` = NULL, `external_business_id` = NULL, `connected_merchant_id` = NULL, `connected_user_id` = NULL, `connected_advertiser_id` = NULL, `connected_lba_id` = NULL, `connected_tag_id` = NULL, `partner_access_token_expiry` = NULL, `partner_refresh_token_expiry` = NULL, `scopes` = NULL, `created_timestamp` = NULL, `updated_timestamp` = NULL, `additional_id_1` = NULL, `partner_metadata` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`external_business_id`)) {
        if (!(is.character(`external_business_id`) && length(`external_business_id`) == 1)) {
          stop(paste("Error! Invalid data for `external_business_id`. Must be a string:", `external_business_id`))
        }
        self$`external_business_id` <- `external_business_id`
      }
      if (!is.null(`connected_merchant_id`)) {
        if (!(is.character(`connected_merchant_id`) && length(`connected_merchant_id`) == 1)) {
          stop(paste("Error! Invalid data for `connected_merchant_id`. Must be a string:", `connected_merchant_id`))
        }
        self$`connected_merchant_id` <- `connected_merchant_id`
      }
      if (!is.null(`connected_user_id`)) {
        if (!(is.character(`connected_user_id`) && length(`connected_user_id`) == 1)) {
          stop(paste("Error! Invalid data for `connected_user_id`. Must be a string:", `connected_user_id`))
        }
        self$`connected_user_id` <- `connected_user_id`
      }
      if (!is.null(`connected_advertiser_id`)) {
        if (!(is.character(`connected_advertiser_id`) && length(`connected_advertiser_id`) == 1)) {
          stop(paste("Error! Invalid data for `connected_advertiser_id`. Must be a string:", `connected_advertiser_id`))
        }
        self$`connected_advertiser_id` <- `connected_advertiser_id`
      }
      if (!is.null(`connected_lba_id`)) {
        if (!(is.character(`connected_lba_id`) && length(`connected_lba_id`) == 1)) {
          stop(paste("Error! Invalid data for `connected_lba_id`. Must be a string:", `connected_lba_id`))
        }
        self$`connected_lba_id` <- `connected_lba_id`
      }
      if (!is.null(`connected_tag_id`)) {
        if (!(is.character(`connected_tag_id`) && length(`connected_tag_id`) == 1)) {
          stop(paste("Error! Invalid data for `connected_tag_id`. Must be a string:", `connected_tag_id`))
        }
        self$`connected_tag_id` <- `connected_tag_id`
      }
      if (!is.null(`partner_access_token_expiry`)) {
        self$`partner_access_token_expiry` <- `partner_access_token_expiry`
      }
      if (!is.null(`partner_refresh_token_expiry`)) {
        self$`partner_refresh_token_expiry` <- `partner_refresh_token_expiry`
      }
      if (!is.null(`scopes`)) {
        if (!(is.character(`scopes`) && length(`scopes`) == 1)) {
          stop(paste("Error! Invalid data for `scopes`. Must be a string:", `scopes`))
        }
        self$`scopes` <- `scopes`
      }
      if (!is.null(`created_timestamp`)) {
        self$`created_timestamp` <- `created_timestamp`
      }
      if (!is.null(`updated_timestamp`)) {
        self$`updated_timestamp` <- `updated_timestamp`
      }
      if (!is.null(`additional_id_1`)) {
        if (!(is.character(`additional_id_1`) && length(`additional_id_1`) == 1)) {
          stop(paste("Error! Invalid data for `additional_id_1`. Must be a string:", `additional_id_1`))
        }
        self$`additional_id_1` <- `additional_id_1`
      }
      if (!is.null(`partner_metadata`)) {
        if (!(is.character(`partner_metadata`) && length(`partner_metadata`) == 1)) {
          stop(paste("Error! Invalid data for `partner_metadata`. Must be a string:", `partner_metadata`))
        }
        self$`partner_metadata` <- `partner_metadata`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return IntegrationMetadata in JSON format
    #' @export
    toJSON = function() {
      IntegrationMetadataObject <- list()
      if (!is.null(self$`id`)) {
        IntegrationMetadataObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`external_business_id`)) {
        IntegrationMetadataObject[["external_business_id"]] <-
          self$`external_business_id`
      }
      if (!is.null(self$`connected_merchant_id`)) {
        IntegrationMetadataObject[["connected_merchant_id"]] <-
          self$`connected_merchant_id`
      }
      if (!is.null(self$`connected_user_id`)) {
        IntegrationMetadataObject[["connected_user_id"]] <-
          self$`connected_user_id`
      }
      if (!is.null(self$`connected_advertiser_id`)) {
        IntegrationMetadataObject[["connected_advertiser_id"]] <-
          self$`connected_advertiser_id`
      }
      if (!is.null(self$`connected_lba_id`)) {
        IntegrationMetadataObject[["connected_lba_id"]] <-
          self$`connected_lba_id`
      }
      if (!is.null(self$`connected_tag_id`)) {
        IntegrationMetadataObject[["connected_tag_id"]] <-
          self$`connected_tag_id`
      }
      if (!is.null(self$`partner_access_token_expiry`)) {
        IntegrationMetadataObject[["partner_access_token_expiry"]] <-
          self$`partner_access_token_expiry`
      }
      if (!is.null(self$`partner_refresh_token_expiry`)) {
        IntegrationMetadataObject[["partner_refresh_token_expiry"]] <-
          self$`partner_refresh_token_expiry`
      }
      if (!is.null(self$`scopes`)) {
        IntegrationMetadataObject[["scopes"]] <-
          self$`scopes`
      }
      if (!is.null(self$`created_timestamp`)) {
        IntegrationMetadataObject[["created_timestamp"]] <-
          self$`created_timestamp`
      }
      if (!is.null(self$`updated_timestamp`)) {
        IntegrationMetadataObject[["updated_timestamp"]] <-
          self$`updated_timestamp`
      }
      if (!is.null(self$`additional_id_1`)) {
        IntegrationMetadataObject[["additional_id_1"]] <-
          self$`additional_id_1`
      }
      if (!is.null(self$`partner_metadata`)) {
        IntegrationMetadataObject[["partner_metadata"]] <-
          self$`partner_metadata`
      }
      IntegrationMetadataObject
    },
    #' Deserialize JSON string into an instance of IntegrationMetadata
    #'
    #' @description
    #' Deserialize JSON string into an instance of IntegrationMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of IntegrationMetadata
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`external_business_id`)) {
        self$`external_business_id` <- this_object$`external_business_id`
      }
      if (!is.null(this_object$`connected_merchant_id`)) {
        self$`connected_merchant_id` <- this_object$`connected_merchant_id`
      }
      if (!is.null(this_object$`connected_user_id`)) {
        self$`connected_user_id` <- this_object$`connected_user_id`
      }
      if (!is.null(this_object$`connected_advertiser_id`)) {
        self$`connected_advertiser_id` <- this_object$`connected_advertiser_id`
      }
      if (!is.null(this_object$`connected_lba_id`)) {
        self$`connected_lba_id` <- this_object$`connected_lba_id`
      }
      if (!is.null(this_object$`connected_tag_id`)) {
        self$`connected_tag_id` <- this_object$`connected_tag_id`
      }
      if (!is.null(this_object$`partner_access_token_expiry`)) {
        self$`partner_access_token_expiry` <- this_object$`partner_access_token_expiry`
      }
      if (!is.null(this_object$`partner_refresh_token_expiry`)) {
        self$`partner_refresh_token_expiry` <- this_object$`partner_refresh_token_expiry`
      }
      if (!is.null(this_object$`scopes`)) {
        self$`scopes` <- this_object$`scopes`
      }
      if (!is.null(this_object$`created_timestamp`)) {
        self$`created_timestamp` <- this_object$`created_timestamp`
      }
      if (!is.null(this_object$`updated_timestamp`)) {
        self$`updated_timestamp` <- this_object$`updated_timestamp`
      }
      if (!is.null(this_object$`additional_id_1`)) {
        self$`additional_id_1` <- this_object$`additional_id_1`
      }
      if (!is.null(this_object$`partner_metadata`)) {
        self$`partner_metadata` <- this_object$`partner_metadata`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return IntegrationMetadata in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`external_business_id`)) {
          sprintf(
          '"external_business_id":
            "%s"
                    ',
          self$`external_business_id`
          )
        },
        if (!is.null(self$`connected_merchant_id`)) {
          sprintf(
          '"connected_merchant_id":
            "%s"
                    ',
          self$`connected_merchant_id`
          )
        },
        if (!is.null(self$`connected_user_id`)) {
          sprintf(
          '"connected_user_id":
            "%s"
                    ',
          self$`connected_user_id`
          )
        },
        if (!is.null(self$`connected_advertiser_id`)) {
          sprintf(
          '"connected_advertiser_id":
            "%s"
                    ',
          self$`connected_advertiser_id`
          )
        },
        if (!is.null(self$`connected_lba_id`)) {
          sprintf(
          '"connected_lba_id":
            "%s"
                    ',
          self$`connected_lba_id`
          )
        },
        if (!is.null(self$`connected_tag_id`)) {
          sprintf(
          '"connected_tag_id":
            "%s"
                    ',
          self$`connected_tag_id`
          )
        },
        if (!is.null(self$`partner_access_token_expiry`)) {
          sprintf(
          '"partner_access_token_expiry":
            %d
                    ',
          self$`partner_access_token_expiry`
          )
        },
        if (!is.null(self$`partner_refresh_token_expiry`)) {
          sprintf(
          '"partner_refresh_token_expiry":
            %d
                    ',
          self$`partner_refresh_token_expiry`
          )
        },
        if (!is.null(self$`scopes`)) {
          sprintf(
          '"scopes":
            "%s"
                    ',
          self$`scopes`
          )
        },
        if (!is.null(self$`created_timestamp`)) {
          sprintf(
          '"created_timestamp":
            %d
                    ',
          self$`created_timestamp`
          )
        },
        if (!is.null(self$`updated_timestamp`)) {
          sprintf(
          '"updated_timestamp":
            %d
                    ',
          self$`updated_timestamp`
          )
        },
        if (!is.null(self$`additional_id_1`)) {
          sprintf(
          '"additional_id_1":
            "%s"
                    ',
          self$`additional_id_1`
          )
        },
        if (!is.null(self$`partner_metadata`)) {
          sprintf(
          '"partner_metadata":
            "%s"
                    ',
          self$`partner_metadata`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of IntegrationMetadata
    #'
    #' @description
    #' Deserialize JSON string into an instance of IntegrationMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of IntegrationMetadata
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`external_business_id` <- this_object$`external_business_id`
      self$`connected_merchant_id` <- this_object$`connected_merchant_id`
      self$`connected_user_id` <- this_object$`connected_user_id`
      self$`connected_advertiser_id` <- this_object$`connected_advertiser_id`
      self$`connected_lba_id` <- this_object$`connected_lba_id`
      self$`connected_tag_id` <- this_object$`connected_tag_id`
      self$`partner_access_token_expiry` <- this_object$`partner_access_token_expiry`
      self$`partner_refresh_token_expiry` <- this_object$`partner_refresh_token_expiry`
      self$`scopes` <- this_object$`scopes`
      self$`created_timestamp` <- this_object$`created_timestamp`
      self$`updated_timestamp` <- this_object$`updated_timestamp`
      self$`additional_id_1` <- this_object$`additional_id_1`
      self$`partner_metadata` <- this_object$`partner_metadata`
      self
    },
    #' Validate JSON input with respect to IntegrationMetadata
    #'
    #' @description
    #' Validate JSON input with respect to IntegrationMetadata and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of IntegrationMetadata
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# IntegrationMetadata$unlock()
#
## Below is an example to define the print function
# IntegrationMetadata$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# IntegrationMetadata$lock()

