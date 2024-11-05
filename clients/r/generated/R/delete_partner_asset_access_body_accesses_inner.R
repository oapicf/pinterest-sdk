#' Create a new DeletePartnerAssetAccessBodyAccessesInner
#'
#' @description
#' DeletePartnerAssetAccessBodyAccessesInner Class
#'
#' @docType class
#' @title DeletePartnerAssetAccessBodyAccessesInner
#' @description DeletePartnerAssetAccessBodyAccessesInner Class
#' @format An \code{R6Class} generator object
#' @field partner_id Unique identifier of a business partner to update asset access to. character
#' @field asset_id Unique identifier of the business asset. character
#' @field partner_type If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DeletePartnerAssetAccessBodyAccessesInner <- R6::R6Class(
  "DeletePartnerAssetAccessBodyAccessesInner",
  public = list(
    `partner_id` = NULL,
    `asset_id` = NULL,
    `partner_type` = NULL,

    #' @description
    #' Initialize a new DeletePartnerAssetAccessBodyAccessesInner class.
    #'
    #' @param partner_id Unique identifier of a business partner to update asset access to.
    #' @param asset_id Unique identifier of the business asset.
    #' @param partner_type If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.. Default to "INTERNAL".
    #' @param ... Other optional arguments.
    initialize = function(`partner_id`, `asset_id`, `partner_type` = "INTERNAL", ...) {
      if (!missing(`partner_id`)) {
        if (!(is.character(`partner_id`) && length(`partner_id`) == 1)) {
          stop(paste("Error! Invalid data for `partner_id`. Must be a string:", `partner_id`))
        }
        self$`partner_id` <- `partner_id`
      }
      if (!missing(`asset_id`)) {
        if (!(is.character(`asset_id`) && length(`asset_id`) == 1)) {
          stop(paste("Error! Invalid data for `asset_id`. Must be a string:", `asset_id`))
        }
        self$`asset_id` <- `asset_id`
      }
      if (!is.null(`partner_type`)) {
        if (!(`partner_type` %in% c("INTERNAL", "EXTERNAL"))) {
          stop(paste("Error! \"", `partner_type`, "\" cannot be assigned to `partner_type`. Must be \"INTERNAL\", \"EXTERNAL\".", sep = ""))
        }
        if (!(is.character(`partner_type`) && length(`partner_type`) == 1)) {
          stop(paste("Error! Invalid data for `partner_type`. Must be a string:", `partner_type`))
        }
        self$`partner_type` <- `partner_type`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return DeletePartnerAssetAccessBodyAccessesInner in JSON format
    toJSON = function() {
      DeletePartnerAssetAccessBodyAccessesInnerObject <- list()
      if (!is.null(self$`partner_id`)) {
        DeletePartnerAssetAccessBodyAccessesInnerObject[["partner_id"]] <-
          self$`partner_id`
      }
      if (!is.null(self$`asset_id`)) {
        DeletePartnerAssetAccessBodyAccessesInnerObject[["asset_id"]] <-
          self$`asset_id`
      }
      if (!is.null(self$`partner_type`)) {
        DeletePartnerAssetAccessBodyAccessesInnerObject[["partner_type"]] <-
          self$`partner_type`
      }
      DeletePartnerAssetAccessBodyAccessesInnerObject
    },

    #' @description
    #' Deserialize JSON string into an instance of DeletePartnerAssetAccessBodyAccessesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeletePartnerAssetAccessBodyAccessesInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`partner_id`)) {
        self$`partner_id` <- this_object$`partner_id`
      }
      if (!is.null(this_object$`asset_id`)) {
        self$`asset_id` <- this_object$`asset_id`
      }
      if (!is.null(this_object$`partner_type`)) {
        if (!is.null(this_object$`partner_type`) && !(this_object$`partner_type` %in% c("INTERNAL", "EXTERNAL"))) {
          stop(paste("Error! \"", this_object$`partner_type`, "\" cannot be assigned to `partner_type`. Must be \"INTERNAL\", \"EXTERNAL\".", sep = ""))
        }
        self$`partner_type` <- this_object$`partner_type`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return DeletePartnerAssetAccessBodyAccessesInner in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`partner_id`)) {
          sprintf(
          '"partner_id":
            "%s"
                    ',
          self$`partner_id`
          )
        },
        if (!is.null(self$`asset_id`)) {
          sprintf(
          '"asset_id":
            "%s"
                    ',
          self$`asset_id`
          )
        },
        if (!is.null(self$`partner_type`)) {
          sprintf(
          '"partner_type":
            "%s"
                    ',
          self$`partner_type`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of DeletePartnerAssetAccessBodyAccessesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeletePartnerAssetAccessBodyAccessesInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`partner_id` <- this_object$`partner_id`
      self$`asset_id` <- this_object$`asset_id`
      if (!is.null(this_object$`partner_type`) && !(this_object$`partner_type` %in% c("INTERNAL", "EXTERNAL"))) {
        stop(paste("Error! \"", this_object$`partner_type`, "\" cannot be assigned to `partner_type`. Must be \"INTERNAL\", \"EXTERNAL\".", sep = ""))
      }
      self$`partner_type` <- this_object$`partner_type`
      self
    },

    #' @description
    #' Validate JSON input with respect to DeletePartnerAssetAccessBodyAccessesInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `partner_id`
      if (!is.null(input_json$`partner_id`)) {
        if (!(is.character(input_json$`partner_id`) && length(input_json$`partner_id`) == 1)) {
          stop(paste("Error! Invalid data for `partner_id`. Must be a string:", input_json$`partner_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for DeletePartnerAssetAccessBodyAccessesInner: the required field `partner_id` is missing."))
      }
      # check the required field `asset_id`
      if (!is.null(input_json$`asset_id`)) {
        if (!(is.character(input_json$`asset_id`) && length(input_json$`asset_id`) == 1)) {
          stop(paste("Error! Invalid data for `asset_id`. Must be a string:", input_json$`asset_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for DeletePartnerAssetAccessBodyAccessesInner: the required field `asset_id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of DeletePartnerAssetAccessBodyAccessesInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `partner_id` is null
      if (is.null(self$`partner_id`)) {
        return(FALSE)
      }

      if (nchar(self$`partner_id`) > 25) {
        return(FALSE)
      }
      if (!str_detect(self$`partner_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `asset_id` is null
      if (is.null(self$`asset_id`)) {
        return(FALSE)
      }

      if (nchar(self$`asset_id`) > 25) {
        return(FALSE)
      }
      if (!str_detect(self$`asset_id`, "^\\d+$")) {
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
      # check if the required `partner_id` is null
      if (is.null(self$`partner_id`)) {
        invalid_fields["partner_id"] <- "Non-nullable required field `partner_id` cannot be null."
      }

      if (nchar(self$`partner_id`) > 25) {
        invalid_fields["partner_id"] <- "Invalid length for `partner_id`, must be smaller than or equal to 25."
      }
      if (!str_detect(self$`partner_id`, "^\\d+$")) {
        invalid_fields["partner_id"] <- "Invalid value for `partner_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `asset_id` is null
      if (is.null(self$`asset_id`)) {
        invalid_fields["asset_id"] <- "Non-nullable required field `asset_id` cannot be null."
      }

      if (nchar(self$`asset_id`) > 25) {
        invalid_fields["asset_id"] <- "Invalid length for `asset_id`, must be smaller than or equal to 25."
      }
      if (!str_detect(self$`asset_id`, "^\\d+$")) {
        invalid_fields["asset_id"] <- "Invalid value for `asset_id`, must conform to the pattern ^\\d+$."
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
# DeletePartnerAssetAccessBodyAccessesInner$unlock()
#
## Below is an example to define the print function
# DeletePartnerAssetAccessBodyAccessesInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DeletePartnerAssetAccessBodyAccessesInner$lock()

