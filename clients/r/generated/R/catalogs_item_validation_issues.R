#' Create a new CatalogsItemValidationIssues
#'
#' @description
#' CatalogsItemValidationIssues Class
#'
#' @docType class
#' @title CatalogsItemValidationIssues
#' @description CatalogsItemValidationIssues Class
#' @format An \code{R6Class} generator object
#' @field item_number Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation. integer
#' @field item_id The merchant-created unique ID that represents the product. character
#' @field errors  \link{CatalogsItemValidationErrors}
#' @field warnings  \link{CatalogsItemValidationWarnings}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsItemValidationIssues <- R6::R6Class(
  "CatalogsItemValidationIssues",
  public = list(
    `item_number` = NULL,
    `item_id` = NULL,
    `errors` = NULL,
    `warnings` = NULL,
    #' Initialize a new CatalogsItemValidationIssues class.
    #'
    #' @description
    #' Initialize a new CatalogsItemValidationIssues class.
    #'
    #' @param item_number Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
    #' @param item_id The merchant-created unique ID that represents the product.
    #' @param errors errors
    #' @param warnings warnings
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`item_number`, `item_id`, `errors`, `warnings`, ...) {
      if (!missing(`item_number`)) {
        if (!(is.numeric(`item_number`) && length(`item_number`) == 1)) {
          stop(paste("Error! Invalid data for `item_number`. Must be an integer:", `item_number`))
        }
        self$`item_number` <- `item_number`
      }
      if (!missing(`item_id`)) {
        if (!(is.character(`item_id`) && length(`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", `item_id`))
        }
        self$`item_id` <- `item_id`
      }
      if (!missing(`errors`)) {
        stopifnot(R6::is.R6(`errors`))
        self$`errors` <- `errors`
      }
      if (!missing(`warnings`)) {
        stopifnot(R6::is.R6(`warnings`))
        self$`warnings` <- `warnings`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsItemValidationIssues in JSON format
    #' @export
    toJSON = function() {
      CatalogsItemValidationIssuesObject <- list()
      if (!is.null(self$`item_number`)) {
        CatalogsItemValidationIssuesObject[["item_number"]] <-
          self$`item_number`
      }
      if (!is.null(self$`item_id`)) {
        CatalogsItemValidationIssuesObject[["item_id"]] <-
          self$`item_id`
      }
      if (!is.null(self$`errors`)) {
        CatalogsItemValidationIssuesObject[["errors"]] <-
          self$`errors`$toJSON()
      }
      if (!is.null(self$`warnings`)) {
        CatalogsItemValidationIssuesObject[["warnings"]] <-
          self$`warnings`$toJSON()
      }
      CatalogsItemValidationIssuesObject
    },
    #' Deserialize JSON string into an instance of CatalogsItemValidationIssues
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsItemValidationIssues
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsItemValidationIssues
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`item_number`)) {
        self$`item_number` <- this_object$`item_number`
      }
      if (!is.null(this_object$`item_id`)) {
        self$`item_id` <- this_object$`item_id`
      }
      if (!is.null(this_object$`errors`)) {
        `errors_object` <- CatalogsItemValidationErrors$new()
        `errors_object`$fromJSON(jsonlite::toJSON(this_object$`errors`, auto_unbox = TRUE, digits = NA))
        self$`errors` <- `errors_object`
      }
      if (!is.null(this_object$`warnings`)) {
        `warnings_object` <- CatalogsItemValidationWarnings$new()
        `warnings_object`$fromJSON(jsonlite::toJSON(this_object$`warnings`, auto_unbox = TRUE, digits = NA))
        self$`warnings` <- `warnings_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsItemValidationIssues in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`item_number`)) {
          sprintf(
          '"item_number":
            %d
                    ',
          self$`item_number`
          )
        },
        if (!is.null(self$`item_id`)) {
          sprintf(
          '"item_id":
            "%s"
                    ',
          self$`item_id`
          )
        },
        if (!is.null(self$`errors`)) {
          sprintf(
          '"errors":
          %s
          ',
          jsonlite::toJSON(self$`errors`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`warnings`)) {
          sprintf(
          '"warnings":
          %s
          ',
          jsonlite::toJSON(self$`warnings`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CatalogsItemValidationIssues
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsItemValidationIssues
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsItemValidationIssues
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`item_number` <- this_object$`item_number`
      self$`item_id` <- this_object$`item_id`
      self$`errors` <- CatalogsItemValidationErrors$new()$fromJSON(jsonlite::toJSON(this_object$`errors`, auto_unbox = TRUE, digits = NA))
      self$`warnings` <- CatalogsItemValidationWarnings$new()$fromJSON(jsonlite::toJSON(this_object$`warnings`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to CatalogsItemValidationIssues
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsItemValidationIssues and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `item_number`
      if (!is.null(input_json$`item_number`)) {
        if (!(is.numeric(input_json$`item_number`) && length(input_json$`item_number`) == 1)) {
          stop(paste("Error! Invalid data for `item_number`. Must be an integer:", input_json$`item_number`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsItemValidationIssues: the required field `item_number` is missing."))
      }
      # check the required field `item_id`
      if (!is.null(input_json$`item_id`)) {
        if (!(is.character(input_json$`item_id`) && length(input_json$`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", input_json$`item_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsItemValidationIssues: the required field `item_id` is missing."))
      }
      # check the required field `errors`
      if (!is.null(input_json$`errors`)) {
        stopifnot(R6::is.R6(input_json$`errors`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsItemValidationIssues: the required field `errors` is missing."))
      }
      # check the required field `warnings`
      if (!is.null(input_json$`warnings`)) {
        stopifnot(R6::is.R6(input_json$`warnings`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsItemValidationIssues: the required field `warnings` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsItemValidationIssues
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      # check if the required `item_number` is null
      if (is.null(self$`item_number`)) {
        return(FALSE)
      }

      # check if the required `errors` is null
      if (is.null(self$`errors`)) {
        return(FALSE)
      }

      # check if the required `warnings` is null
      if (is.null(self$`warnings`)) {
        return(FALSE)
      }

      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `item_number` is null
      if (is.null(self$`item_number`)) {
        invalid_fields["item_number"] <- "Non-nullable required field `item_number` cannot be null."
      }

      # check if the required `errors` is null
      if (is.null(self$`errors`)) {
        invalid_fields["errors"] <- "Non-nullable required field `errors` cannot be null."
      }

      # check if the required `warnings` is null
      if (is.null(self$`warnings`)) {
        invalid_fields["warnings"] <- "Non-nullable required field `warnings` cannot be null."
      }

      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# CatalogsItemValidationIssues$unlock()
#
## Below is an example to define the print function
# CatalogsItemValidationIssues$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsItemValidationIssues$lock()

