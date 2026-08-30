#' Create a new BusinessMemberAssetsGetResponse
#'
#' @description
#' Paginated response for business member assets with total count metadata.
#'
#' @docType class
#' @title BusinessMemberAssetsGetResponse
#' @description BusinessMemberAssetsGetResponse Class
#' @format An \code{R6Class} generator object
#' @field bookmark  character [optional]
#' @field items  list(\link{AssetIdPermissions})
#' @field total_data_count Total number of assets matching the query integer
#' @field total_data_count_by_status Breakdown of asset counts by entity status (ad accounts only) \link{TotalCountByEntityStatus} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BusinessMemberAssetsGetResponse <- R6::R6Class(
  "BusinessMemberAssetsGetResponse",
  public = list(
    `bookmark` = NULL,
    `items` = NULL,
    `total_data_count` = NULL,
    `total_data_count_by_status` = NULL,

    #' @description
    #' Initialize a new BusinessMemberAssetsGetResponse class.
    #'
    #' @param items items
    #' @param total_data_count Total number of assets matching the query
    #' @param bookmark bookmark
    #' @param total_data_count_by_status Breakdown of asset counts by entity status (ad accounts only)
    #' @param ... Other optional arguments.
    initialize = function(`items`, `total_data_count`, `bookmark` = NULL, `total_data_count_by_status` = NULL, ...) {
      if (!missing(`items`)) {
        stopifnot(is.vector(`items`), length(`items`) != 0)
        sapply(`items`, function(x) stopifnot(R6::is.R6(x)))
        self$`items` <- `items`
      }
      if (!missing(`total_data_count`)) {
        if (!(is.numeric(`total_data_count`) && length(`total_data_count`) == 1)) {
          stop(paste("Error! Invalid data for `total_data_count`. Must be an integer:", `total_data_count`))
        }
        self$`total_data_count` <- `total_data_count`
      }
      if (!is.null(`bookmark`)) {
        if (!(is.character(`bookmark`) && length(`bookmark`) == 1)) {
          stop(paste("Error! Invalid data for `bookmark`. Must be a string:", `bookmark`))
        }
        self$`bookmark` <- `bookmark`
      }
      if (!is.null(`total_data_count_by_status`)) {
        stopifnot(R6::is.R6(`total_data_count_by_status`))
        self$`total_data_count_by_status` <- `total_data_count_by_status`
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
    #' @return BusinessMemberAssetsGetResponse as a base R list.
    #' @examples
    #' # convert array of BusinessMemberAssetsGetResponse (x) to a data frame
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
    #' Convert BusinessMemberAssetsGetResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BusinessMemberAssetsGetResponseObject <- list()
      if (!is.null(self$`bookmark`)) {
        BusinessMemberAssetsGetResponseObject[["bookmark"]] <-
          self$`bookmark`
      }
      if (!is.null(self$`items`)) {
        BusinessMemberAssetsGetResponseObject[["items"]] <-
          self$extractSimpleType(self$`items`)
      }
      if (!is.null(self$`total_data_count`)) {
        BusinessMemberAssetsGetResponseObject[["total_data_count"]] <-
          self$`total_data_count`
      }
      if (!is.null(self$`total_data_count_by_status`)) {
        BusinessMemberAssetsGetResponseObject[["total_data_count_by_status"]] <-
          self$extractSimpleType(self$`total_data_count_by_status`)
      }
      return(BusinessMemberAssetsGetResponseObject)
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
    #' Deserialize JSON string into an instance of BusinessMemberAssetsGetResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of BusinessMemberAssetsGetResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`bookmark`)) {
        self$`bookmark` <- this_object$`bookmark`
      }
      if (!is.null(this_object$`items`)) {
        self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[AssetIdPermissions]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`total_data_count`)) {
        self$`total_data_count` <- this_object$`total_data_count`
      }
      if (!is.null(this_object$`total_data_count_by_status`)) {
        `total_data_count_by_status_object` <- TotalCountByEntityStatus$new()
        `total_data_count_by_status_object`$fromJSON(jsonlite::toJSON(this_object$`total_data_count_by_status`, auto_unbox = TRUE, digits = NA))
        self$`total_data_count_by_status` <- `total_data_count_by_status_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BusinessMemberAssetsGetResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BusinessMemberAssetsGetResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of BusinessMemberAssetsGetResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`bookmark` <- this_object$`bookmark`
      self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[AssetIdPermissions]", loadNamespace("openapi"))
      self$`total_data_count` <- this_object$`total_data_count`
      self$`total_data_count_by_status` <- TotalCountByEntityStatus$new()$fromJSON(jsonlite::toJSON(this_object$`total_data_count_by_status`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to BusinessMemberAssetsGetResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `items`
      if (!is.null(input_json$`items`)) {
        stopifnot(is.vector(input_json$`items`), length(input_json$`items`) != 0)
        tmp <- sapply(input_json$`items`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BusinessMemberAssetsGetResponse: the required field `items` is missing."))
      }
      # check the required field `total_data_count`
      if (!is.null(input_json$`total_data_count`)) {
        if (!(is.numeric(input_json$`total_data_count`) && length(input_json$`total_data_count`) == 1)) {
          stop(paste("Error! Invalid data for `total_data_count`. Must be an integer:", input_json$`total_data_count`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BusinessMemberAssetsGetResponse: the required field `total_data_count` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BusinessMemberAssetsGetResponse
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `items` is null
      if (is.null(self$`items`)) {
        return(FALSE)
      }

      # check if the required `total_data_count` is null
      if (is.null(self$`total_data_count`)) {
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
      # check if the required `items` is null
      if (is.null(self$`items`)) {
        invalid_fields["items"] <- "Non-nullable required field `items` cannot be null."
      }

      # check if the required `total_data_count` is null
      if (is.null(self$`total_data_count`)) {
        invalid_fields["total_data_count"] <- "Non-nullable required field `total_data_count` cannot be null."
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
# BusinessMemberAssetsGetResponse$unlock()
#
## Below is an example to define the print function
# BusinessMemberAssetsGetResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BusinessMemberAssetsGetResponse$lock()

