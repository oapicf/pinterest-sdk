#' Create a new IntegrationRequest
#'
#' @description
#' Schema used for creating the integration metadata.
#'
#' @docType class
#' @title IntegrationRequest
#' @description IntegrationRequest Class
#' @format An \code{R6Class} generator object
#' @field external_business_id External business ID for the integration. character [optional]
#' @field connected_merchant_id  character [optional]
#' @field connected_advertiser_id  character [optional]
#' @field connected_lba_id  character [optional]
#' @field connected_tag_id  character [optional]
#' @field partner_access_token  character [optional]
#' @field partner_refresh_token  character [optional]
#' @field partner_primary_email  character [optional]
#' @field partner_access_token_expiry  integer [optional]
#' @field partner_refresh_token_expiry  integer [optional]
#' @field scopes  character [optional]
#' @field additional_id_1  character [optional]
#' @field partner_metadata  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
IntegrationRequest <- R6::R6Class(
  "IntegrationRequest",
  public = list(
    `external_business_id` = NULL,
    `connected_merchant_id` = NULL,
    `connected_advertiser_id` = NULL,
    `connected_lba_id` = NULL,
    `connected_tag_id` = NULL,
    `partner_access_token` = NULL,
    `partner_refresh_token` = NULL,
    `partner_primary_email` = NULL,
    `partner_access_token_expiry` = NULL,
    `partner_refresh_token_expiry` = NULL,
    `scopes` = NULL,
    `additional_id_1` = NULL,
    `partner_metadata` = NULL,

    #' @description
    #' Initialize a new IntegrationRequest class.
    #'
    #' @param external_business_id External business ID for the integration.
    #' @param connected_merchant_id connected_merchant_id
    #' @param connected_advertiser_id connected_advertiser_id
    #' @param connected_lba_id connected_lba_id
    #' @param connected_tag_id connected_tag_id
    #' @param partner_access_token partner_access_token
    #' @param partner_refresh_token partner_refresh_token
    #' @param partner_primary_email partner_primary_email
    #' @param partner_access_token_expiry partner_access_token_expiry
    #' @param partner_refresh_token_expiry partner_refresh_token_expiry
    #' @param scopes scopes
    #' @param additional_id_1 additional_id_1
    #' @param partner_metadata partner_metadata
    #' @param ... Other optional arguments.
    initialize = function(`external_business_id` = NULL, `connected_merchant_id` = NULL, `connected_advertiser_id` = NULL, `connected_lba_id` = NULL, `connected_tag_id` = NULL, `partner_access_token` = NULL, `partner_refresh_token` = NULL, `partner_primary_email` = NULL, `partner_access_token_expiry` = NULL, `partner_refresh_token_expiry` = NULL, `scopes` = NULL, `additional_id_1` = NULL, `partner_metadata` = NULL, ...) {
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
      if (!is.null(`partner_access_token`)) {
        if (!(is.character(`partner_access_token`) && length(`partner_access_token`) == 1)) {
          stop(paste("Error! Invalid data for `partner_access_token`. Must be a string:", `partner_access_token`))
        }
        self$`partner_access_token` <- `partner_access_token`
      }
      if (!is.null(`partner_refresh_token`)) {
        if (!(is.character(`partner_refresh_token`) && length(`partner_refresh_token`) == 1)) {
          stop(paste("Error! Invalid data for `partner_refresh_token`. Must be a string:", `partner_refresh_token`))
        }
        self$`partner_refresh_token` <- `partner_refresh_token`
      }
      if (!is.null(`partner_primary_email`)) {
        if (!(is.character(`partner_primary_email`) && length(`partner_primary_email`) == 1)) {
          stop(paste("Error! Invalid data for `partner_primary_email`. Must be a string:", `partner_primary_email`))
        }
        self$`partner_primary_email` <- `partner_primary_email`
      }
      if (!is.null(`partner_access_token_expiry`)) {
        if (!(is.numeric(`partner_access_token_expiry`) && length(`partner_access_token_expiry`) == 1)) {
          stop(paste("Error! Invalid data for `partner_access_token_expiry`. Must be an integer:", `partner_access_token_expiry`))
        }
        self$`partner_access_token_expiry` <- `partner_access_token_expiry`
      }
      if (!is.null(`partner_refresh_token_expiry`)) {
        if (!(is.numeric(`partner_refresh_token_expiry`) && length(`partner_refresh_token_expiry`) == 1)) {
          stop(paste("Error! Invalid data for `partner_refresh_token_expiry`. Must be an integer:", `partner_refresh_token_expiry`))
        }
        self$`partner_refresh_token_expiry` <- `partner_refresh_token_expiry`
      }
      if (!is.null(`scopes`)) {
        if (!(is.character(`scopes`) && length(`scopes`) == 1)) {
          stop(paste("Error! Invalid data for `scopes`. Must be a string:", `scopes`))
        }
        self$`scopes` <- `scopes`
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

    #' @description
    #' To JSON String
    #'
    #' @return IntegrationRequest in JSON format
    toJSON = function() {
      IntegrationRequestObject <- list()
      if (!is.null(self$`external_business_id`)) {
        IntegrationRequestObject[["external_business_id"]] <-
          self$`external_business_id`
      }
      if (!is.null(self$`connected_merchant_id`)) {
        IntegrationRequestObject[["connected_merchant_id"]] <-
          self$`connected_merchant_id`
      }
      if (!is.null(self$`connected_advertiser_id`)) {
        IntegrationRequestObject[["connected_advertiser_id"]] <-
          self$`connected_advertiser_id`
      }
      if (!is.null(self$`connected_lba_id`)) {
        IntegrationRequestObject[["connected_lba_id"]] <-
          self$`connected_lba_id`
      }
      if (!is.null(self$`connected_tag_id`)) {
        IntegrationRequestObject[["connected_tag_id"]] <-
          self$`connected_tag_id`
      }
      if (!is.null(self$`partner_access_token`)) {
        IntegrationRequestObject[["partner_access_token"]] <-
          self$`partner_access_token`
      }
      if (!is.null(self$`partner_refresh_token`)) {
        IntegrationRequestObject[["partner_refresh_token"]] <-
          self$`partner_refresh_token`
      }
      if (!is.null(self$`partner_primary_email`)) {
        IntegrationRequestObject[["partner_primary_email"]] <-
          self$`partner_primary_email`
      }
      if (!is.null(self$`partner_access_token_expiry`)) {
        IntegrationRequestObject[["partner_access_token_expiry"]] <-
          self$`partner_access_token_expiry`
      }
      if (!is.null(self$`partner_refresh_token_expiry`)) {
        IntegrationRequestObject[["partner_refresh_token_expiry"]] <-
          self$`partner_refresh_token_expiry`
      }
      if (!is.null(self$`scopes`)) {
        IntegrationRequestObject[["scopes"]] <-
          self$`scopes`
      }
      if (!is.null(self$`additional_id_1`)) {
        IntegrationRequestObject[["additional_id_1"]] <-
          self$`additional_id_1`
      }
      if (!is.null(self$`partner_metadata`)) {
        IntegrationRequestObject[["partner_metadata"]] <-
          self$`partner_metadata`
      }
      IntegrationRequestObject
    },

    #' @description
    #' Deserialize JSON string into an instance of IntegrationRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of IntegrationRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`external_business_id`)) {
        self$`external_business_id` <- this_object$`external_business_id`
      }
      if (!is.null(this_object$`connected_merchant_id`)) {
        self$`connected_merchant_id` <- this_object$`connected_merchant_id`
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
      if (!is.null(this_object$`partner_access_token`)) {
        self$`partner_access_token` <- this_object$`partner_access_token`
      }
      if (!is.null(this_object$`partner_refresh_token`)) {
        self$`partner_refresh_token` <- this_object$`partner_refresh_token`
      }
      if (!is.null(this_object$`partner_primary_email`)) {
        self$`partner_primary_email` <- this_object$`partner_primary_email`
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
      if (!is.null(this_object$`additional_id_1`)) {
        self$`additional_id_1` <- this_object$`additional_id_1`
      }
      if (!is.null(this_object$`partner_metadata`)) {
        self$`partner_metadata` <- this_object$`partner_metadata`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return IntegrationRequest in JSON format
    toJSONString = function() {
      jsoncontent <- c(
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
        if (!is.null(self$`partner_access_token`)) {
          sprintf(
          '"partner_access_token":
            "%s"
                    ',
          self$`partner_access_token`
          )
        },
        if (!is.null(self$`partner_refresh_token`)) {
          sprintf(
          '"partner_refresh_token":
            "%s"
                    ',
          self$`partner_refresh_token`
          )
        },
        if (!is.null(self$`partner_primary_email`)) {
          sprintf(
          '"partner_primary_email":
            "%s"
                    ',
          self$`partner_primary_email`
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

    #' @description
    #' Deserialize JSON string into an instance of IntegrationRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of IntegrationRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`external_business_id` <- this_object$`external_business_id`
      self$`connected_merchant_id` <- this_object$`connected_merchant_id`
      self$`connected_advertiser_id` <- this_object$`connected_advertiser_id`
      self$`connected_lba_id` <- this_object$`connected_lba_id`
      self$`connected_tag_id` <- this_object$`connected_tag_id`
      self$`partner_access_token` <- this_object$`partner_access_token`
      self$`partner_refresh_token` <- this_object$`partner_refresh_token`
      self$`partner_primary_email` <- this_object$`partner_primary_email`
      self$`partner_access_token_expiry` <- this_object$`partner_access_token_expiry`
      self$`partner_refresh_token_expiry` <- this_object$`partner_refresh_token_expiry`
      self$`scopes` <- this_object$`scopes`
      self$`additional_id_1` <- this_object$`additional_id_1`
      self$`partner_metadata` <- this_object$`partner_metadata`
      self
    },

    #' @description
    #' Validate JSON input with respect to IntegrationRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of IntegrationRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# IntegrationRequest$unlock()
#
## Below is an example to define the print function
# IntegrationRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# IntegrationRequest$lock()

