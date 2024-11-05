#' Create a new UpdatePartnerAssetAccessBodyAccessesInner
#'
#' @description
#' UpdatePartnerAssetAccessBodyAccessesInner Class
#'
#' @docType class
#' @title UpdatePartnerAssetAccessBodyAccessesInner
#' @description UpdatePartnerAssetAccessBodyAccessesInner Class
#' @format An \code{R6Class} generator object
#' @field partner_id Unique identifier of a business partner to update asset access to. character
#' @field asset_id Unique identifier of the business asset. character
#' @field permissions A non-empty array of permissions to assign to the partner. list(\link{Permissions})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdatePartnerAssetAccessBodyAccessesInner <- R6::R6Class(
  "UpdatePartnerAssetAccessBodyAccessesInner",
  public = list(
    `partner_id` = NULL,
    `asset_id` = NULL,
    `permissions` = NULL,

    #' @description
    #' Initialize a new UpdatePartnerAssetAccessBodyAccessesInner class.
    #'
    #' @param partner_id Unique identifier of a business partner to update asset access to.
    #' @param asset_id Unique identifier of the business asset.
    #' @param permissions A non-empty array of permissions to assign to the partner.
    #' @param ... Other optional arguments.
    initialize = function(`partner_id`, `asset_id`, `permissions`, ...) {
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
      if (!missing(`permissions`)) {
        stopifnot(is.vector(`permissions`), length(`permissions`) != 0)
        sapply(`permissions`, function(x) stopifnot(R6::is.R6(x)))
        self$`permissions` <- `permissions`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return UpdatePartnerAssetAccessBodyAccessesInner in JSON format
    toJSON = function() {
      UpdatePartnerAssetAccessBodyAccessesInnerObject <- list()
      if (!is.null(self$`partner_id`)) {
        UpdatePartnerAssetAccessBodyAccessesInnerObject[["partner_id"]] <-
          self$`partner_id`
      }
      if (!is.null(self$`asset_id`)) {
        UpdatePartnerAssetAccessBodyAccessesInnerObject[["asset_id"]] <-
          self$`asset_id`
      }
      if (!is.null(self$`permissions`)) {
        UpdatePartnerAssetAccessBodyAccessesInnerObject[["permissions"]] <-
          lapply(self$`permissions`, function(x) x$toJSON())
      }
      UpdatePartnerAssetAccessBodyAccessesInnerObject
    },

    #' @description
    #' Deserialize JSON string into an instance of UpdatePartnerAssetAccessBodyAccessesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdatePartnerAssetAccessBodyAccessesInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`partner_id`)) {
        self$`partner_id` <- this_object$`partner_id`
      }
      if (!is.null(this_object$`asset_id`)) {
        self$`asset_id` <- this_object$`asset_id`
      }
      if (!is.null(this_object$`permissions`)) {
        self$`permissions` <- ApiClient$new()$deserializeObj(this_object$`permissions`, "array[Permissions]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return UpdatePartnerAssetAccessBodyAccessesInner in JSON format
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
        if (!is.null(self$`permissions`)) {
          sprintf(
          '"permissions":
          [%s]
',
          paste(sapply(self$`permissions`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of UpdatePartnerAssetAccessBodyAccessesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdatePartnerAssetAccessBodyAccessesInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`partner_id` <- this_object$`partner_id`
      self$`asset_id` <- this_object$`asset_id`
      self$`permissions` <- ApiClient$new()$deserializeObj(this_object$`permissions`, "array[Permissions]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to UpdatePartnerAssetAccessBodyAccessesInner and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for UpdatePartnerAssetAccessBodyAccessesInner: the required field `partner_id` is missing."))
      }
      # check the required field `asset_id`
      if (!is.null(input_json$`asset_id`)) {
        if (!(is.character(input_json$`asset_id`) && length(input_json$`asset_id`) == 1)) {
          stop(paste("Error! Invalid data for `asset_id`. Must be a string:", input_json$`asset_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UpdatePartnerAssetAccessBodyAccessesInner: the required field `asset_id` is missing."))
      }
      # check the required field `permissions`
      if (!is.null(input_json$`permissions`)) {
        stopifnot(is.vector(input_json$`permissions`), length(input_json$`permissions`) != 0)
        tmp <- sapply(input_json$`permissions`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UpdatePartnerAssetAccessBodyAccessesInner: the required field `permissions` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UpdatePartnerAssetAccessBodyAccessesInner
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

      # check if the required `permissions` is null
      if (is.null(self$`permissions`)) {
        return(FALSE)
      }

      if (length(self$`permissions`) > 50) {
        return(FALSE)
      }
      if (length(self$`permissions`) < 1) {
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

      # check if the required `permissions` is null
      if (is.null(self$`permissions`)) {
        invalid_fields["permissions"] <- "Non-nullable required field `permissions` cannot be null."
      }

      if (length(self$`permissions`) > 50) {
        invalid_fields["permissions"] <- "Invalid length for `permissions`, number of items must be less than or equal to 50."
      }
      if (length(self$`permissions`) < 1) {
        invalid_fields["permissions"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# UpdatePartnerAssetAccessBodyAccessesInner$unlock()
#
## Below is an example to define the print function
# UpdatePartnerAssetAccessBodyAccessesInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdatePartnerAssetAccessBodyAccessesInner$lock()

