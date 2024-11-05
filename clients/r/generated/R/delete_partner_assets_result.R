#' Create a new DeletePartnerAssetsResult
#'
#' @description
#' The terminated asset access.
#'
#' @docType class
#' @title DeletePartnerAssetsResult
#' @description DeletePartnerAssetsResult Class
#' @format An \code{R6Class} generator object
#' @field asset_id Unique identifier of a business asset. character [optional]
#' @field asset_type Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. character [optional]
#' @field permissions Permission levels member or partner has on an asset. list(character) [optional]
#' @field is_shared_partner If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset.<br> If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset. character [optional]
#' @field partner_id Unique identifier of a business partner. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DeletePartnerAssetsResult <- R6::R6Class(
  "DeletePartnerAssetsResult",
  public = list(
    `asset_id` = NULL,
    `asset_type` = NULL,
    `permissions` = NULL,
    `is_shared_partner` = NULL,
    `partner_id` = NULL,

    #' @description
    #' Initialize a new DeletePartnerAssetsResult class.
    #'
    #' @param asset_id Unique identifier of a business asset.
    #' @param asset_type Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
    #' @param permissions Permission levels member or partner has on an asset.
    #' @param is_shared_partner If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset.<br> If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset.
    #' @param partner_id Unique identifier of a business partner.
    #' @param ... Other optional arguments.
    initialize = function(`asset_id` = NULL, `asset_type` = NULL, `permissions` = NULL, `is_shared_partner` = NULL, `partner_id` = NULL, ...) {
      if (!is.null(`asset_id`)) {
        if (!(is.character(`asset_id`) && length(`asset_id`) == 1)) {
          stop(paste("Error! Invalid data for `asset_id`. Must be a string:", `asset_id`))
        }
        self$`asset_id` <- `asset_id`
      }
      if (!is.null(`asset_type`)) {
        if (!(is.character(`asset_type`) && length(`asset_type`) == 1)) {
          stop(paste("Error! Invalid data for `asset_type`. Must be a string:", `asset_type`))
        }
        self$`asset_type` <- `asset_type`
      }
      if (!is.null(`permissions`)) {
        stopifnot(is.vector(`permissions`), length(`permissions`) != 0)
        sapply(`permissions`, function(x) stopifnot(is.character(x)))
        self$`permissions` <- `permissions`
      }
      if (!is.null(`is_shared_partner`)) {
        if (!(is.logical(`is_shared_partner`) && length(`is_shared_partner`) == 1)) {
          stop(paste("Error! Invalid data for `is_shared_partner`. Must be a boolean:", `is_shared_partner`))
        }
        self$`is_shared_partner` <- `is_shared_partner`
      }
      if (!is.null(`partner_id`)) {
        if (!(is.character(`partner_id`) && length(`partner_id`) == 1)) {
          stop(paste("Error! Invalid data for `partner_id`. Must be a string:", `partner_id`))
        }
        self$`partner_id` <- `partner_id`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return DeletePartnerAssetsResult in JSON format
    toJSON = function() {
      DeletePartnerAssetsResultObject <- list()
      if (!is.null(self$`asset_id`)) {
        DeletePartnerAssetsResultObject[["asset_id"]] <-
          self$`asset_id`
      }
      if (!is.null(self$`asset_type`)) {
        DeletePartnerAssetsResultObject[["asset_type"]] <-
          self$`asset_type`
      }
      if (!is.null(self$`permissions`)) {
        DeletePartnerAssetsResultObject[["permissions"]] <-
          self$`permissions`
      }
      if (!is.null(self$`is_shared_partner`)) {
        DeletePartnerAssetsResultObject[["is_shared_partner"]] <-
          self$`is_shared_partner`
      }
      if (!is.null(self$`partner_id`)) {
        DeletePartnerAssetsResultObject[["partner_id"]] <-
          self$`partner_id`
      }
      DeletePartnerAssetsResultObject
    },

    #' @description
    #' Deserialize JSON string into an instance of DeletePartnerAssetsResult
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeletePartnerAssetsResult
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`asset_id`)) {
        self$`asset_id` <- this_object$`asset_id`
      }
      if (!is.null(this_object$`asset_type`)) {
        self$`asset_type` <- this_object$`asset_type`
      }
      if (!is.null(this_object$`permissions`)) {
        self$`permissions` <- ApiClient$new()$deserializeObj(this_object$`permissions`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`is_shared_partner`)) {
        self$`is_shared_partner` <- this_object$`is_shared_partner`
      }
      if (!is.null(this_object$`partner_id`)) {
        self$`partner_id` <- this_object$`partner_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return DeletePartnerAssetsResult in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`asset_id`)) {
          sprintf(
          '"asset_id":
            "%s"
                    ',
          self$`asset_id`
          )
        },
        if (!is.null(self$`asset_type`)) {
          sprintf(
          '"asset_type":
            "%s"
                    ',
          self$`asset_type`
          )
        },
        if (!is.null(self$`permissions`)) {
          sprintf(
          '"permissions":
             [%s]
          ',
          paste(unlist(lapply(self$`permissions`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`is_shared_partner`)) {
          sprintf(
          '"is_shared_partner":
            %s
                    ',
          tolower(self$`is_shared_partner`)
          )
        },
        if (!is.null(self$`partner_id`)) {
          sprintf(
          '"partner_id":
            "%s"
                    ',
          self$`partner_id`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of DeletePartnerAssetsResult
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeletePartnerAssetsResult
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`asset_id` <- this_object$`asset_id`
      self$`asset_type` <- this_object$`asset_type`
      self$`permissions` <- ApiClient$new()$deserializeObj(this_object$`permissions`, "array[character]", loadNamespace("openapi"))
      self$`is_shared_partner` <- this_object$`is_shared_partner`
      self$`partner_id` <- this_object$`partner_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to DeletePartnerAssetsResult and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of DeletePartnerAssetsResult
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`asset_id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`partner_id`, "^\\d+$")) {
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
      if (!str_detect(self$`asset_id`, "^\\d+$")) {
        invalid_fields["asset_id"] <- "Invalid value for `asset_id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`partner_id`, "^\\d+$")) {
        invalid_fields["partner_id"] <- "Invalid value for `partner_id`, must conform to the pattern ^\\d+$."
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
# DeletePartnerAssetsResult$unlock()
#
## Below is an example to define the print function
# DeletePartnerAssetsResult$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DeletePartnerAssetsResult$lock()

