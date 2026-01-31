#' Create a new GetPartnerAssetsResponse
#'
#' @description
#' An object containing the permissions a you/your business partner has on the asset.
#'
#' @docType class
#' @title GetPartnerAssetsResponse
#' @description GetPartnerAssetsResponse Class
#' @format An \code{R6Class} generator object
#' @field asset_group_info  \link{AssetGroupBinding} [optional]
#' @field asset_id Unique identifier of a business asset. character [optional]
#' @field asset_type Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. character [optional]
#' @field permissions The permissions you or your partner has on the asset. If partner_type=INTERNAL, the permission levels are for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the permission levels are for the access you have to the partner's business asset. list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetPartnerAssetsResponse <- R6::R6Class(
  "GetPartnerAssetsResponse",
  public = list(
    `asset_group_info` = NULL,
    `asset_id` = NULL,
    `asset_type` = NULL,
    `permissions` = NULL,

    #' @description
    #' Initialize a new GetPartnerAssetsResponse class.
    #'
    #' @param asset_group_info asset_group_info
    #' @param asset_id Unique identifier of a business asset.
    #' @param asset_type Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
    #' @param permissions The permissions you or your partner has on the asset. If partner_type=INTERNAL, the permission levels are for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the permission levels are for the access you have to the partner's business asset.
    #' @param ... Other optional arguments.
    initialize = function(`asset_group_info` = NULL, `asset_id` = NULL, `asset_type` = NULL, `permissions` = NULL, ...) {
      if (!is.null(`asset_group_info`)) {
        stopifnot(R6::is.R6(`asset_group_info`))
        self$`asset_group_info` <- `asset_group_info`
      }
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
    #' @return GetPartnerAssetsResponse as a base R list.
    #' @examples
    #' # convert array of GetPartnerAssetsResponse (x) to a data frame
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
    #' Convert GetPartnerAssetsResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      GetPartnerAssetsResponseObject <- list()
      if (!is.null(self$`asset_group_info`)) {
        GetPartnerAssetsResponseObject[["asset_group_info"]] <-
          self$`asset_group_info`$toSimpleType()
      }
      if (!is.null(self$`asset_id`)) {
        GetPartnerAssetsResponseObject[["asset_id"]] <-
          self$`asset_id`
      }
      if (!is.null(self$`asset_type`)) {
        GetPartnerAssetsResponseObject[["asset_type"]] <-
          self$`asset_type`
      }
      if (!is.null(self$`permissions`)) {
        GetPartnerAssetsResponseObject[["permissions"]] <-
          self$`permissions`
      }
      return(GetPartnerAssetsResponseObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of GetPartnerAssetsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetPartnerAssetsResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`asset_group_info`)) {
        `asset_group_info_object` <- AssetGroupBinding$new()
        `asset_group_info_object`$fromJSON(jsonlite::toJSON(this_object$`asset_group_info`, auto_unbox = TRUE, digits = NA))
        self$`asset_group_info` <- `asset_group_info_object`
      }
      if (!is.null(this_object$`asset_id`)) {
        self$`asset_id` <- this_object$`asset_id`
      }
      if (!is.null(this_object$`asset_type`)) {
        self$`asset_type` <- this_object$`asset_type`
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
    #' @return GetPartnerAssetsResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of GetPartnerAssetsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetPartnerAssetsResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`asset_group_info` <- AssetGroupBinding$new()$fromJSON(jsonlite::toJSON(this_object$`asset_group_info`, auto_unbox = TRUE, digits = NA))
      self$`asset_id` <- this_object$`asset_id`
      self$`asset_type` <- this_object$`asset_type`
      self$`permissions` <- ApiClient$new()$deserializeObj(this_object$`permissions`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to GetPartnerAssetsResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetPartnerAssetsResponse
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (nchar(self$`asset_id`) > 20) {
        return(FALSE)
      }
      if (nchar(self$`asset_id`) < 1) {
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
      if (nchar(self$`asset_id`) > 20) {
        invalid_fields["asset_id"] <- "Invalid length for `asset_id`, must be smaller than or equal to 20."
      }
      if (nchar(self$`asset_id`) < 1) {
        invalid_fields["asset_id"] <- "Invalid length for `asset_id`, must be bigger than or equal to 1."
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
# GetPartnerAssetsResponse$unlock()
#
## Below is an example to define the print function
# GetPartnerAssetsResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetPartnerAssetsResponse$lock()

