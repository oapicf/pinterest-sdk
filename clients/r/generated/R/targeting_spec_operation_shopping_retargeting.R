#' Create a new TargetingSpecOperationShoppingRetargeting
#'
#' @description
#' TargetingSpecOperationShoppingRetargeting Class
#'
#' @docType class
#' @title TargetingSpecOperationShoppingRetargeting
#' @description TargetingSpecOperationShoppingRetargeting Class
#' @format An \code{R6Class} generator object
#' @field field  character
#' @field operation  character
#' @field values  list(\link{TargetingSpecShoppingRetargeting})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TargetingSpecOperationShoppingRetargeting <- R6::R6Class(
  "TargetingSpecOperationShoppingRetargeting",
  public = list(
    `field` = NULL,
    `operation` = NULL,
    `values` = NULL,

    #' @description
    #' Initialize a new TargetingSpecOperationShoppingRetargeting class.
    #'
    #' @param field field
    #' @param operation operation
    #' @param values values
    #' @param ... Other optional arguments.
    initialize = function(`field`, `operation`, `values`, ...) {
      if (!missing(`field`)) {
        if (!(`field` %in% c("SHOPPING_RETARGETING"))) {
          stop(paste("Error! \"", `field`, "\" cannot be assigned to `field`. Must be \"SHOPPING_RETARGETING\".", sep = ""))
        }
        if (!(is.character(`field`) && length(`field`) == 1)) {
          stop(paste("Error! Invalid data for `field`. Must be a string:", `field`))
        }
        self$`field` <- `field`
      }
      if (!missing(`operation`)) {
        if (!(`operation` %in% c("SET"))) {
          stop(paste("Error! \"", `operation`, "\" cannot be assigned to `operation`. Must be \"SET\".", sep = ""))
        }
        if (!(is.character(`operation`) && length(`operation`) == 1)) {
          stop(paste("Error! Invalid data for `operation`. Must be a string:", `operation`))
        }
        self$`operation` <- `operation`
      }
      if (!missing(`values`)) {
        stopifnot(is.vector(`values`), length(`values`) != 0)
        sapply(`values`, function(x) stopifnot(R6::is.R6(x)))
        self$`values` <- `values`
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
    #' @return TargetingSpecOperationShoppingRetargeting as a base R list.
    #' @examples
    #' # convert array of TargetingSpecOperationShoppingRetargeting (x) to a data frame
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
    #' Convert TargetingSpecOperationShoppingRetargeting to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TargetingSpecOperationShoppingRetargetingObject <- list()
      if (!is.null(self$`field`)) {
        TargetingSpecOperationShoppingRetargetingObject[["field"]] <-
          self$`field`
      }
      if (!is.null(self$`operation`)) {
        TargetingSpecOperationShoppingRetargetingObject[["operation"]] <-
          self$`operation`
      }
      if (!is.null(self$`values`)) {
        TargetingSpecOperationShoppingRetargetingObject[["values"]] <-
          lapply(self$`values`, function(x) x$toSimpleType())
      }
      return(TargetingSpecOperationShoppingRetargetingObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of TargetingSpecOperationShoppingRetargeting
    #'
    #' @param input_json the JSON input
    #' @return the instance of TargetingSpecOperationShoppingRetargeting
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`field`)) {
        if (!is.null(this_object$`field`) && !(this_object$`field` %in% c("SHOPPING_RETARGETING"))) {
          stop(paste("Error! \"", this_object$`field`, "\" cannot be assigned to `field`. Must be \"SHOPPING_RETARGETING\".", sep = ""))
        }
        self$`field` <- this_object$`field`
      }
      if (!is.null(this_object$`operation`)) {
        if (!is.null(this_object$`operation`) && !(this_object$`operation` %in% c("SET"))) {
          stop(paste("Error! \"", this_object$`operation`, "\" cannot be assigned to `operation`. Must be \"SET\".", sep = ""))
        }
        self$`operation` <- this_object$`operation`
      }
      if (!is.null(this_object$`values`)) {
        self$`values` <- ApiClient$new()$deserializeObj(this_object$`values`, "array[TargetingSpecShoppingRetargeting]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return TargetingSpecOperationShoppingRetargeting in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TargetingSpecOperationShoppingRetargeting
    #'
    #' @param input_json the JSON input
    #' @return the instance of TargetingSpecOperationShoppingRetargeting
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`field`) && !(this_object$`field` %in% c("SHOPPING_RETARGETING"))) {
        stop(paste("Error! \"", this_object$`field`, "\" cannot be assigned to `field`. Must be \"SHOPPING_RETARGETING\".", sep = ""))
      }
      self$`field` <- this_object$`field`
      if (!is.null(this_object$`operation`) && !(this_object$`operation` %in% c("SET"))) {
        stop(paste("Error! \"", this_object$`operation`, "\" cannot be assigned to `operation`. Must be \"SET\".", sep = ""))
      }
      self$`operation` <- this_object$`operation`
      self$`values` <- ApiClient$new()$deserializeObj(this_object$`values`, "array[TargetingSpecShoppingRetargeting]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to TargetingSpecOperationShoppingRetargeting and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `field`
      if (!is.null(input_json$`field`)) {
        if (!(is.character(input_json$`field`) && length(input_json$`field`) == 1)) {
          stop(paste("Error! Invalid data for `field`. Must be a string:", input_json$`field`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TargetingSpecOperationShoppingRetargeting: the required field `field` is missing."))
      }
      # check the required field `operation`
      if (!is.null(input_json$`operation`)) {
        if (!(is.character(input_json$`operation`) && length(input_json$`operation`) == 1)) {
          stop(paste("Error! Invalid data for `operation`. Must be a string:", input_json$`operation`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TargetingSpecOperationShoppingRetargeting: the required field `operation` is missing."))
      }
      # check the required field `values`
      if (!is.null(input_json$`values`)) {
        stopifnot(is.vector(input_json$`values`), length(input_json$`values`) != 0)
        tmp <- sapply(input_json$`values`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TargetingSpecOperationShoppingRetargeting: the required field `values` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TargetingSpecOperationShoppingRetargeting
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `field` is null
      if (is.null(self$`field`)) {
        return(FALSE)
      }

      # check if the required `operation` is null
      if (is.null(self$`operation`)) {
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
      # check if the required `field` is null
      if (is.null(self$`field`)) {
        invalid_fields["field"] <- "Non-nullable required field `field` cannot be null."
      }

      # check if the required `operation` is null
      if (is.null(self$`operation`)) {
        invalid_fields["operation"] <- "Non-nullable required field `operation` cannot be null."
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
# TargetingSpecOperationShoppingRetargeting$unlock()
#
## Below is an example to define the print function
# TargetingSpecOperationShoppingRetargeting$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TargetingSpecOperationShoppingRetargeting$lock()

