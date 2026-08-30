#' Create a new LabelBulkCreateRequest
#'
#' @description
#' LabelBulkCreateRequest Class
#'
#' @docType class
#' @title LabelBulkCreateRequest
#' @description LabelBulkCreateRequest Class
#' @format An \code{R6Class} generator object
#' @field labels Labels that you are applying to the campaign. list(\link{LabelCreateItem})
#' @field parent_id Unique identifier of the asset you are labelling. Currently, you can only label campaigns. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LabelBulkCreateRequest <- R6::R6Class(
  "LabelBulkCreateRequest",
  public = list(
    `labels` = NULL,
    `parent_id` = NULL,

    #' @description
    #' Initialize a new LabelBulkCreateRequest class.
    #'
    #' @param labels Labels that you are applying to the campaign.
    #' @param parent_id Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
    #' @param ... Other optional arguments.
    initialize = function(`labels`, `parent_id`, ...) {
      if (!missing(`labels`)) {
        stopifnot(is.vector(`labels`), length(`labels`) != 0)
        sapply(`labels`, function(x) stopifnot(R6::is.R6(x)))
        self$`labels` <- `labels`
      }
      if (!missing(`parent_id`)) {
        if (!(is.character(`parent_id`) && length(`parent_id`) == 1)) {
          stop(paste("Error! Invalid data for `parent_id`. Must be a string:", `parent_id`))
        }
        self$`parent_id` <- `parent_id`
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
    #' @return LabelBulkCreateRequest as a base R list.
    #' @examples
    #' # convert array of LabelBulkCreateRequest (x) to a data frame
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
    #' Convert LabelBulkCreateRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LabelBulkCreateRequestObject <- list()
      if (!is.null(self$`labels`)) {
        LabelBulkCreateRequestObject[["labels"]] <-
          self$extractSimpleType(self$`labels`)
      }
      if (!is.null(self$`parent_id`)) {
        LabelBulkCreateRequestObject[["parent_id"]] <-
          self$`parent_id`
      }
      return(LabelBulkCreateRequestObject)
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
    #' Deserialize JSON string into an instance of LabelBulkCreateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of LabelBulkCreateRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`labels`)) {
        self$`labels` <- ApiClient$new()$deserializeObj(this_object$`labels`, "array[LabelCreateItem]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`parent_id`)) {
        self$`parent_id` <- this_object$`parent_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return LabelBulkCreateRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LabelBulkCreateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of LabelBulkCreateRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`labels` <- ApiClient$new()$deserializeObj(this_object$`labels`, "array[LabelCreateItem]", loadNamespace("openapi"))
      self$`parent_id` <- this_object$`parent_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to LabelBulkCreateRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `labels`
      if (!is.null(input_json$`labels`)) {
        stopifnot(is.vector(input_json$`labels`), length(input_json$`labels`) != 0)
        tmp <- sapply(input_json$`labels`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LabelBulkCreateRequest: the required field `labels` is missing."))
      }
      # check the required field `parent_id`
      if (!is.null(input_json$`parent_id`)) {
        if (!(is.character(input_json$`parent_id`) && length(input_json$`parent_id`) == 1)) {
          stop(paste("Error! Invalid data for `parent_id`. Must be a string:", input_json$`parent_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LabelBulkCreateRequest: the required field `parent_id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LabelBulkCreateRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `labels` is null
      if (is.null(self$`labels`)) {
        return(FALSE)
      }

      # check if the required `parent_id` is null
      if (is.null(self$`parent_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`parent_id`, "^[C]?\\d+$")) {
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
      # check if the required `labels` is null
      if (is.null(self$`labels`)) {
        invalid_fields["labels"] <- "Non-nullable required field `labels` cannot be null."
      }

      # check if the required `parent_id` is null
      if (is.null(self$`parent_id`)) {
        invalid_fields["parent_id"] <- "Non-nullable required field `parent_id` cannot be null."
      }

      if (!str_detect(self$`parent_id`, "^[C]?\\d+$")) {
        invalid_fields["parent_id"] <- "Invalid value for `parent_id`, must conform to the pattern ^[C]?\\d+$."
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
# LabelBulkCreateRequest$unlock()
#
## Below is an example to define the print function
# LabelBulkCreateRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LabelBulkCreateRequest$lock()

