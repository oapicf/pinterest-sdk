#' Create a new CreateAssetAccessRequestItem
#'
#' @description
#' CreateAssetAccessRequestItem Class
#'
#' @docType class
#' @title CreateAssetAccessRequestItem
#' @description CreateAssetAccessRequestItem Class
#' @format An \code{R6Class} generator object
#' @field asset_id_to_permissions An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. named list(list(\link{Permissions}))
#' @field partner_id Unique identifier of a business partner to request asset access to. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateAssetAccessRequestItem <- R6::R6Class(
  "CreateAssetAccessRequestItem",
  public = list(
    `asset_id_to_permissions` = NULL,
    `partner_id` = NULL,

    #' @description
    #' Initialize a new CreateAssetAccessRequestItem class.
    #'
    #' @param asset_id_to_permissions An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.
    #' @param partner_id Unique identifier of a business partner to request asset access to.
    #' @param ... Other optional arguments.
    initialize = function(`asset_id_to_permissions`, `partner_id`, ...) {
      if (!missing(`asset_id_to_permissions`)) {
        stopifnot(is.vector(`asset_id_to_permissions`), length(`asset_id_to_permissions`) != 0)
        sapply(`asset_id_to_permissions`, function(x) stopifnot(R6::is.R6(x)))
        self$`asset_id_to_permissions` <- `asset_id_to_permissions`
      }
      if (!missing(`partner_id`)) {
        if (!(is.character(`partner_id`) && length(`partner_id`) == 1)) {
          stop(paste("Error! Invalid data for `partner_id`. Must be a string:", `partner_id`))
        }
        self$`partner_id` <- `partner_id`
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
    #' @return CreateAssetAccessRequestItem as a base R list.
    #' @examples
    #' # convert array of CreateAssetAccessRequestItem (x) to a data frame
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
    #' Convert CreateAssetAccessRequestItem to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CreateAssetAccessRequestItemObject <- list()
      if (!is.null(self$`asset_id_to_permissions`)) {
        CreateAssetAccessRequestItemObject[["asset_id_to_permissions"]] <-
          self$extractSimpleType(self$`asset_id_to_permissions`)
      }
      if (!is.null(self$`partner_id`)) {
        CreateAssetAccessRequestItemObject[["partner_id"]] <-
          self$`partner_id`
      }
      return(CreateAssetAccessRequestItemObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateAssetAccessRequestItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateAssetAccessRequestItem
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`asset_id_to_permissions`)) {
        self$`asset_id_to_permissions` <- ApiClient$new()$deserializeObj(this_object$`asset_id_to_permissions`, "map(Array)", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`partner_id`)) {
        self$`partner_id` <- this_object$`partner_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CreateAssetAccessRequestItem in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateAssetAccessRequestItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateAssetAccessRequestItem
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`asset_id_to_permissions` <- ApiClient$new()$deserializeObj(this_object$`asset_id_to_permissions`, "map(Array)", loadNamespace("openapi"))
      self$`partner_id` <- this_object$`partner_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateAssetAccessRequestItem and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `asset_id_to_permissions`
      if (!is.null(input_json$`asset_id_to_permissions`)) {
        stopifnot(is.vector(input_json$`asset_id_to_permissions`), length(input_json$`asset_id_to_permissions`) != 0)
        tmp <- sapply(input_json$`asset_id_to_permissions`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateAssetAccessRequestItem: the required field `asset_id_to_permissions` is missing."))
      }
      # check the required field `partner_id`
      if (!is.null(input_json$`partner_id`)) {
        if (!(is.character(input_json$`partner_id`) && length(input_json$`partner_id`) == 1)) {
          stop(paste("Error! Invalid data for `partner_id`. Must be a string:", input_json$`partner_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateAssetAccessRequestItem: the required field `partner_id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateAssetAccessRequestItem
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `asset_id_to_permissions` is null
      if (is.null(self$`asset_id_to_permissions`)) {
        return(FALSE)
      }

      # check if the required `partner_id` is null
      if (is.null(self$`partner_id`)) {
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
      # check if the required `asset_id_to_permissions` is null
      if (is.null(self$`asset_id_to_permissions`)) {
        invalid_fields["asset_id_to_permissions"] <- "Non-nullable required field `asset_id_to_permissions` cannot be null."
      }

      # check if the required `partner_id` is null
      if (is.null(self$`partner_id`)) {
        invalid_fields["partner_id"] <- "Non-nullable required field `partner_id` cannot be null."
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
# CreateAssetAccessRequestItem$unlock()
#
## Below is an example to define the print function
# CreateAssetAccessRequestItem$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateAssetAccessRequestItem$lock()

