#' Create a new InviteAssetsSummaryProfilesInner
#'
#' @description
#' InviteAssetsSummaryProfilesInner Class
#'
#' @docType class
#' @title InviteAssetsSummaryProfilesInner
#' @description InviteAssetsSummaryProfilesInner Class
#' @format An \code{R6Class} generator object
#' @field id Unique identifier of a business profile. character [optional]
#' @field permissions Permission levels member or partner has on an asset. list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
InviteAssetsSummaryProfilesInner <- R6::R6Class(
  "InviteAssetsSummaryProfilesInner",
  public = list(
    `id` = NULL,
    `permissions` = NULL,

    #' @description
    #' Initialize a new InviteAssetsSummaryProfilesInner class.
    #'
    #' @param id Unique identifier of a business profile.
    #' @param permissions Permission levels member or partner has on an asset.
    #' @param ... Other optional arguments.
    initialize = function(`id` = NULL, `permissions` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
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
    #' @return InviteAssetsSummaryProfilesInner as a base R list.
    #' @examples
    #' # convert array of InviteAssetsSummaryProfilesInner (x) to a data frame
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
    #' Convert InviteAssetsSummaryProfilesInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      InviteAssetsSummaryProfilesInnerObject <- list()
      if (!is.null(self$`id`)) {
        InviteAssetsSummaryProfilesInnerObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`permissions`)) {
        InviteAssetsSummaryProfilesInnerObject[["permissions"]] <-
          self$`permissions`
      }
      return(InviteAssetsSummaryProfilesInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of InviteAssetsSummaryProfilesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of InviteAssetsSummaryProfilesInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
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
    #' @return InviteAssetsSummaryProfilesInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of InviteAssetsSummaryProfilesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of InviteAssetsSummaryProfilesInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`permissions` <- ApiClient$new()$deserializeObj(this_object$`permissions`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to InviteAssetsSummaryProfilesInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of InviteAssetsSummaryProfilesInner
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
# InviteAssetsSummaryProfilesInner$unlock()
#
## Below is an example to define the print function
# InviteAssetsSummaryProfilesInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# InviteAssetsSummaryProfilesInner$lock()

