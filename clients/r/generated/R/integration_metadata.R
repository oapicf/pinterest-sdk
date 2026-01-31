#' Create a new IntegrationMetadata
#'
#' @description
#' Integration metadata
#'
#' @docType class
#' @title IntegrationMetadata
#' @description IntegrationMetadata Class
#' @format An \code{R6Class} generator object
#' @field additional_id_1  character [optional]
#' @field connected_advertiser_id  character [optional]
#' @field connected_lba_id  character [optional]
#' @field connected_merchant_id  character [optional]
#' @field connected_tag_id  character [optional]
#' @field connected_user_id  character [optional]
#' @field created_timestamp  numeric [optional]
#' @field external_business_id  character [optional]
#' @field id  character [optional]
#' @field partner_access_token_expiry  numeric [optional]
#' @field partner_metadata  character [optional]
#' @field partner_refresh_token_expiry  numeric [optional]
#' @field scopes  character [optional]
#' @field updated_timestamp  numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
IntegrationMetadata <- R6::R6Class(
  "IntegrationMetadata",
  public = list(
    `additional_id_1` = NULL,
    `connected_advertiser_id` = NULL,
    `connected_lba_id` = NULL,
    `connected_merchant_id` = NULL,
    `connected_tag_id` = NULL,
    `connected_user_id` = NULL,
    `created_timestamp` = NULL,
    `external_business_id` = NULL,
    `id` = NULL,
    `partner_access_token_expiry` = NULL,
    `partner_metadata` = NULL,
    `partner_refresh_token_expiry` = NULL,
    `scopes` = NULL,
    `updated_timestamp` = NULL,

    #' @description
    #' Initialize a new IntegrationMetadata class.
    #'
    #' @param additional_id_1 additional_id_1
    #' @param connected_advertiser_id connected_advertiser_id
    #' @param connected_lba_id connected_lba_id
    #' @param connected_merchant_id connected_merchant_id
    #' @param connected_tag_id connected_tag_id
    #' @param connected_user_id connected_user_id
    #' @param created_timestamp created_timestamp
    #' @param external_business_id external_business_id
    #' @param id id
    #' @param partner_access_token_expiry partner_access_token_expiry
    #' @param partner_metadata partner_metadata
    #' @param partner_refresh_token_expiry partner_refresh_token_expiry
    #' @param scopes scopes
    #' @param updated_timestamp updated_timestamp
    #' @param ... Other optional arguments.
    initialize = function(`additional_id_1` = NULL, `connected_advertiser_id` = NULL, `connected_lba_id` = NULL, `connected_merchant_id` = NULL, `connected_tag_id` = NULL, `connected_user_id` = NULL, `created_timestamp` = NULL, `external_business_id` = NULL, `id` = NULL, `partner_access_token_expiry` = NULL, `partner_metadata` = NULL, `partner_refresh_token_expiry` = NULL, `scopes` = NULL, `updated_timestamp` = NULL, ...) {
      if (!is.null(`additional_id_1`)) {
        if (!(is.character(`additional_id_1`) && length(`additional_id_1`) == 1)) {
          stop(paste("Error! Invalid data for `additional_id_1`. Must be a string:", `additional_id_1`))
        }
        self$`additional_id_1` <- `additional_id_1`
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
      if (!is.null(`connected_merchant_id`)) {
        if (!(is.character(`connected_merchant_id`) && length(`connected_merchant_id`) == 1)) {
          stop(paste("Error! Invalid data for `connected_merchant_id`. Must be a string:", `connected_merchant_id`))
        }
        self$`connected_merchant_id` <- `connected_merchant_id`
      }
      if (!is.null(`connected_tag_id`)) {
        if (!(is.character(`connected_tag_id`) && length(`connected_tag_id`) == 1)) {
          stop(paste("Error! Invalid data for `connected_tag_id`. Must be a string:", `connected_tag_id`))
        }
        self$`connected_tag_id` <- `connected_tag_id`
      }
      if (!is.null(`connected_user_id`)) {
        if (!(is.character(`connected_user_id`) && length(`connected_user_id`) == 1)) {
          stop(paste("Error! Invalid data for `connected_user_id`. Must be a string:", `connected_user_id`))
        }
        self$`connected_user_id` <- `connected_user_id`
      }
      if (!is.null(`created_timestamp`)) {
        self$`created_timestamp` <- `created_timestamp`
      }
      if (!is.null(`external_business_id`)) {
        if (!(is.character(`external_business_id`) && length(`external_business_id`) == 1)) {
          stop(paste("Error! Invalid data for `external_business_id`. Must be a string:", `external_business_id`))
        }
        self$`external_business_id` <- `external_business_id`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`partner_access_token_expiry`)) {
        self$`partner_access_token_expiry` <- `partner_access_token_expiry`
      }
      if (!is.null(`partner_metadata`)) {
        if (!(is.character(`partner_metadata`) && length(`partner_metadata`) == 1)) {
          stop(paste("Error! Invalid data for `partner_metadata`. Must be a string:", `partner_metadata`))
        }
        self$`partner_metadata` <- `partner_metadata`
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
      if (!is.null(`updated_timestamp`)) {
        self$`updated_timestamp` <- `updated_timestamp`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return IntegrationMetadata as a base R list.
    #' @examples
    #' # convert array of IntegrationMetadata (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert IntegrationMetadata to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      IntegrationMetadataObject <- list()
      if (!is.null(self$`additional_id_1`)) {
        IntegrationMetadataObject[["additional_id_1"]] <-
          self$`additional_id_1`
      }
      if (!is.null(self$`connected_advertiser_id`)) {
        IntegrationMetadataObject[["connected_advertiser_id"]] <-
          self$`connected_advertiser_id`
      }
      if (!is.null(self$`connected_lba_id`)) {
        IntegrationMetadataObject[["connected_lba_id"]] <-
          self$`connected_lba_id`
      }
      if (!is.null(self$`connected_merchant_id`)) {
        IntegrationMetadataObject[["connected_merchant_id"]] <-
          self$`connected_merchant_id`
      }
      if (!is.null(self$`connected_tag_id`)) {
        IntegrationMetadataObject[["connected_tag_id"]] <-
          self$`connected_tag_id`
      }
      if (!is.null(self$`connected_user_id`)) {
        IntegrationMetadataObject[["connected_user_id"]] <-
          self$`connected_user_id`
      }
      if (!is.null(self$`created_timestamp`)) {
        IntegrationMetadataObject[["created_timestamp"]] <-
          self$`created_timestamp`
      }
      if (!is.null(self$`external_business_id`)) {
        IntegrationMetadataObject[["external_business_id"]] <-
          self$`external_business_id`
      }
      if (!is.null(self$`id`)) {
        IntegrationMetadataObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`partner_access_token_expiry`)) {
        IntegrationMetadataObject[["partner_access_token_expiry"]] <-
          self$`partner_access_token_expiry`
      }
      if (!is.null(self$`partner_metadata`)) {
        IntegrationMetadataObject[["partner_metadata"]] <-
          self$`partner_metadata`
      }
      if (!is.null(self$`partner_refresh_token_expiry`)) {
        IntegrationMetadataObject[["partner_refresh_token_expiry"]] <-
          self$`partner_refresh_token_expiry`
      }
      if (!is.null(self$`scopes`)) {
        IntegrationMetadataObject[["scopes"]] <-
          self$`scopes`
      }
      if (!is.null(self$`updated_timestamp`)) {
        IntegrationMetadataObject[["updated_timestamp"]] <-
          self$`updated_timestamp`
      }
      return(IntegrationMetadataObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of IntegrationMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of IntegrationMetadata
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`additional_id_1`)) {
        self$`additional_id_1` <- this_object$`additional_id_1`
      }
      if (!is.null(this_object$`connected_advertiser_id`)) {
        self$`connected_advertiser_id` <- this_object$`connected_advertiser_id`
      }
      if (!is.null(this_object$`connected_lba_id`)) {
        self$`connected_lba_id` <- this_object$`connected_lba_id`
      }
      if (!is.null(this_object$`connected_merchant_id`)) {
        self$`connected_merchant_id` <- this_object$`connected_merchant_id`
      }
      if (!is.null(this_object$`connected_tag_id`)) {
        self$`connected_tag_id` <- this_object$`connected_tag_id`
      }
      if (!is.null(this_object$`connected_user_id`)) {
        self$`connected_user_id` <- this_object$`connected_user_id`
      }
      if (!is.null(this_object$`created_timestamp`)) {
        self$`created_timestamp` <- this_object$`created_timestamp`
      }
      if (!is.null(this_object$`external_business_id`)) {
        self$`external_business_id` <- this_object$`external_business_id`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`partner_access_token_expiry`)) {
        self$`partner_access_token_expiry` <- this_object$`partner_access_token_expiry`
      }
      if (!is.null(this_object$`partner_metadata`)) {
        self$`partner_metadata` <- this_object$`partner_metadata`
      }
      if (!is.null(this_object$`partner_refresh_token_expiry`)) {
        self$`partner_refresh_token_expiry` <- this_object$`partner_refresh_token_expiry`
      }
      if (!is.null(this_object$`scopes`)) {
        self$`scopes` <- this_object$`scopes`
      }
      if (!is.null(this_object$`updated_timestamp`)) {
        self$`updated_timestamp` <- this_object$`updated_timestamp`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return IntegrationMetadata in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of IntegrationMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of IntegrationMetadata
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`additional_id_1` <- this_object$`additional_id_1`
      self$`connected_advertiser_id` <- this_object$`connected_advertiser_id`
      self$`connected_lba_id` <- this_object$`connected_lba_id`
      self$`connected_merchant_id` <- this_object$`connected_merchant_id`
      self$`connected_tag_id` <- this_object$`connected_tag_id`
      self$`connected_user_id` <- this_object$`connected_user_id`
      self$`created_timestamp` <- this_object$`created_timestamp`
      self$`external_business_id` <- this_object$`external_business_id`
      self$`id` <- this_object$`id`
      self$`partner_access_token_expiry` <- this_object$`partner_access_token_expiry`
      self$`partner_metadata` <- this_object$`partner_metadata`
      self$`partner_refresh_token_expiry` <- this_object$`partner_refresh_token_expiry`
      self$`scopes` <- this_object$`scopes`
      self$`updated_timestamp` <- this_object$`updated_timestamp`
      self
    },

    #' @description
    #' Validate JSON input with respect to IntegrationMetadata and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of IntegrationMetadata
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

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
# IntegrationMetadata$unlock()
#
## Below is an example to define the print function
# IntegrationMetadata$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# IntegrationMetadata$lock()

