#' Create a new UpdatePartnerAssetsResult
#'
#' @description
#' An object containing the permissions a business partner has on the asset.
#'
#' @docType class
#' @title UpdatePartnerAssetsResult
#' @description UpdatePartnerAssetsResult Class
#' @format An \code{R6Class} generator object
#' @field asset_id Unique identifier of a business asset. character [optional]
#' @field asset_type Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. character [optional]
#' @field partner_id Unique identifier of a business partner. character [optional]
#' @field permissions Permission levels member or partner has on an asset. list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdatePartnerAssetsResult <- R6::R6Class(
  "UpdatePartnerAssetsResult",
  public = list(
    `asset_id` = NULL,
    `asset_type` = NULL,
    `partner_id` = NULL,
    `permissions` = NULL,

    #' @description
    #' Initialize a new UpdatePartnerAssetsResult class.
    #'
    #' @param asset_id Unique identifier of a business asset.
    #' @param asset_type Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
    #' @param partner_id Unique identifier of a business partner.
    #' @param permissions Permission levels member or partner has on an asset.
    #' @param ... Other optional arguments.
    initialize = function(`asset_id` = NULL, `asset_type` = NULL, `partner_id` = NULL, `permissions` = NULL, ...) {
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
      if (!is.null(`partner_id`)) {
        if (!(is.character(`partner_id`) && length(`partner_id`) == 1)) {
          stop(paste("Error! Invalid data for `partner_id`. Must be a string:", `partner_id`))
        }
        self$`partner_id` <- `partner_id`
      }
      if (!is.null(`permissions`)) {
        stopifnot(is.vector(`permissions`), length(`permissions`) != 0)
        sapply(`permissions`, function(x) stopifnot(is.character(x)))
        self$`permissions` <- `permissions`
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
    #' @return UpdatePartnerAssetsResult as a base R list.
    #' @examples
    #' # convert array of UpdatePartnerAssetsResult (x) to a data frame
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
    #' Convert UpdatePartnerAssetsResult to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      UpdatePartnerAssetsResultObject <- list()
      if (!is.null(self$`asset_id`)) {
        UpdatePartnerAssetsResultObject[["asset_id"]] <-
          self$`asset_id`
      }
      if (!is.null(self$`asset_type`)) {
        UpdatePartnerAssetsResultObject[["asset_type"]] <-
          self$`asset_type`
      }
      if (!is.null(self$`partner_id`)) {
        UpdatePartnerAssetsResultObject[["partner_id"]] <-
          self$`partner_id`
      }
      if (!is.null(self$`permissions`)) {
        UpdatePartnerAssetsResultObject[["permissions"]] <-
          self$`permissions`
      }
      return(UpdatePartnerAssetsResultObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of UpdatePartnerAssetsResult
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdatePartnerAssetsResult
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`asset_id`)) {
        self$`asset_id` <- this_object$`asset_id`
      }
      if (!is.null(this_object$`asset_type`)) {
        self$`asset_type` <- this_object$`asset_type`
      }
      if (!is.null(this_object$`partner_id`)) {
        self$`partner_id` <- this_object$`partner_id`
      }
      if (!is.null(this_object$`permissions`)) {
        self$`permissions` <- ApiClient$new()$deserializeObj(this_object$`permissions`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return UpdatePartnerAssetsResult in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of UpdatePartnerAssetsResult
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdatePartnerAssetsResult
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`asset_id` <- this_object$`asset_id`
      self$`asset_type` <- this_object$`asset_type`
      self$`partner_id` <- this_object$`partner_id`
      self$`permissions` <- ApiClient$new()$deserializeObj(this_object$`permissions`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to UpdatePartnerAssetsResult and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UpdatePartnerAssetsResult
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
# UpdatePartnerAssetsResult$unlock()
#
## Below is an example to define the print function
# UpdatePartnerAssetsResult$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdatePartnerAssetsResult$lock()

