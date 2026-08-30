#' Create a new DeleteMemberAssetAccessItem
#'
#' @description
#' DeleteMemberAssetAccessItem Class
#'
#' @docType class
#' @title DeleteMemberAssetAccessItem
#' @description DeleteMemberAssetAccessItem Class
#' @format An \code{R6Class} generator object
#' @field asset_id Id of the asset on which to remove member permissions. character
#' @field member_id Unique identifier of the member on which to perform the asset permission removal character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DeleteMemberAssetAccessItem <- R6::R6Class(
  "DeleteMemberAssetAccessItem",
  public = list(
    `asset_id` = NULL,
    `member_id` = NULL,

    #' @description
    #' Initialize a new DeleteMemberAssetAccessItem class.
    #'
    #' @param asset_id Id of the asset on which to remove member permissions.
    #' @param member_id Unique identifier of the member on which to perform the asset permission removal
    #' @param ... Other optional arguments.
    initialize = function(`asset_id`, `member_id`, ...) {
      if (!missing(`asset_id`)) {
        if (!(is.character(`asset_id`) && length(`asset_id`) == 1)) {
          stop(paste("Error! Invalid data for `asset_id`. Must be a string:", `asset_id`))
        }
        self$`asset_id` <- `asset_id`
      }
      if (!missing(`member_id`)) {
        if (!(is.character(`member_id`) && length(`member_id`) == 1)) {
          stop(paste("Error! Invalid data for `member_id`. Must be a string:", `member_id`))
        }
        self$`member_id` <- `member_id`
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
    #' @return DeleteMemberAssetAccessItem as a base R list.
    #' @examples
    #' # convert array of DeleteMemberAssetAccessItem (x) to a data frame
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
    #' Convert DeleteMemberAssetAccessItem to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      DeleteMemberAssetAccessItemObject <- list()
      if (!is.null(self$`asset_id`)) {
        DeleteMemberAssetAccessItemObject[["asset_id"]] <-
          self$`asset_id`
      }
      if (!is.null(self$`member_id`)) {
        DeleteMemberAssetAccessItemObject[["member_id"]] <-
          self$`member_id`
      }
      return(DeleteMemberAssetAccessItemObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of DeleteMemberAssetAccessItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeleteMemberAssetAccessItem
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`asset_id`)) {
        self$`asset_id` <- this_object$`asset_id`
      }
      if (!is.null(this_object$`member_id`)) {
        self$`member_id` <- this_object$`member_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return DeleteMemberAssetAccessItem in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of DeleteMemberAssetAccessItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeleteMemberAssetAccessItem
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`asset_id` <- this_object$`asset_id`
      self$`member_id` <- this_object$`member_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to DeleteMemberAssetAccessItem and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `asset_id`
      if (!is.null(input_json$`asset_id`)) {
        if (!(is.character(input_json$`asset_id`) && length(input_json$`asset_id`) == 1)) {
          stop(paste("Error! Invalid data for `asset_id`. Must be a string:", input_json$`asset_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for DeleteMemberAssetAccessItem: the required field `asset_id` is missing."))
      }
      # check the required field `member_id`
      if (!is.null(input_json$`member_id`)) {
        if (!(is.character(input_json$`member_id`) && length(input_json$`member_id`) == 1)) {
          stop(paste("Error! Invalid data for `member_id`. Must be a string:", input_json$`member_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for DeleteMemberAssetAccessItem: the required field `member_id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of DeleteMemberAssetAccessItem
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
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

      # check if the required `member_id` is null
      if (is.null(self$`member_id`)) {
        return(FALSE)
      }

      if (nchar(self$`member_id`) > 25) {
        return(FALSE)
      }
      if (!str_detect(self$`member_id`, "^\\d+$")) {
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

      # check if the required `member_id` is null
      if (is.null(self$`member_id`)) {
        invalid_fields["member_id"] <- "Non-nullable required field `member_id` cannot be null."
      }

      if (nchar(self$`member_id`) > 25) {
        invalid_fields["member_id"] <- "Invalid length for `member_id`, must be smaller than or equal to 25."
      }
      if (!str_detect(self$`member_id`, "^\\d+$")) {
        invalid_fields["member_id"] <- "Invalid value for `member_id`, must conform to the pattern ^\\d+$."
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
# DeleteMemberAssetAccessItem$unlock()
#
## Below is an example to define the print function
# DeleteMemberAssetAccessItem$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DeleteMemberAssetAccessItem$lock()

