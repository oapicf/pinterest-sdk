#' Create a new CatalogsItemsUpdateBatchRequest
#'
#' @description
#' Request object to update catalogs items
#'
#' @docType class
#' @title CatalogsItemsUpdateBatchRequest
#' @description CatalogsItemsUpdateBatchRequest Class
#' @format An \code{R6Class} generator object
#' @field country  \link{Country}
#' @field language  \link{Language}
#' @field operation  \link{BatchOperation}
#' @field items Array with catalogs items list(\link{ItemUpdateBatchRecord})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsItemsUpdateBatchRequest <- R6::R6Class(
  "CatalogsItemsUpdateBatchRequest",
  public = list(
    `country` = NULL,
    `language` = NULL,
    `operation` = NULL,
    `items` = NULL,
    #' Initialize a new CatalogsItemsUpdateBatchRequest class.
    #'
    #' @description
    #' Initialize a new CatalogsItemsUpdateBatchRequest class.
    #'
    #' @param country country
    #' @param language language
    #' @param operation operation
    #' @param items Array with catalogs items
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`country`, `language`, `operation`, `items`, ...) {
      if (!missing(`country`)) {
        if (!(`country` %in% c())) {
          stop(paste("Error! \"", `country`, "\" cannot be assigned to `country`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`country`))
        self$`country` <- `country`
      }
      if (!missing(`language`)) {
        if (!(`language` %in% c())) {
          stop(paste("Error! \"", `language`, "\" cannot be assigned to `language`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`language`))
        self$`language` <- `language`
      }
      if (!missing(`operation`)) {
        if (!(`operation` %in% c())) {
          stop(paste("Error! \"", `operation`, "\" cannot be assigned to `operation`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`operation`))
        self$`operation` <- `operation`
      }
      if (!missing(`items`)) {
        stopifnot(is.vector(`items`), length(`items`) != 0)
        sapply(`items`, function(x) stopifnot(R6::is.R6(x)))
        self$`items` <- `items`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsItemsUpdateBatchRequest in JSON format
    #' @export
    toJSON = function() {
      CatalogsItemsUpdateBatchRequestObject <- list()
      if (!is.null(self$`country`)) {
        CatalogsItemsUpdateBatchRequestObject[["country"]] <-
          self$`country`$toJSON()
      }
      if (!is.null(self$`language`)) {
        CatalogsItemsUpdateBatchRequestObject[["language"]] <-
          self$`language`$toJSON()
      }
      if (!is.null(self$`operation`)) {
        CatalogsItemsUpdateBatchRequestObject[["operation"]] <-
          self$`operation`$toJSON()
      }
      if (!is.null(self$`items`)) {
        CatalogsItemsUpdateBatchRequestObject[["items"]] <-
          lapply(self$`items`, function(x) x$toJSON())
      }
      CatalogsItemsUpdateBatchRequestObject
    },
    #' Deserialize JSON string into an instance of CatalogsItemsUpdateBatchRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsItemsUpdateBatchRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsItemsUpdateBatchRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`country`)) {
        `country_object` <- Country$new()
        `country_object`$fromJSON(jsonlite::toJSON(this_object$`country`, auto_unbox = TRUE, digits = NA))
        self$`country` <- `country_object`
      }
      if (!is.null(this_object$`language`)) {
        `language_object` <- Language$new()
        `language_object`$fromJSON(jsonlite::toJSON(this_object$`language`, auto_unbox = TRUE, digits = NA))
        self$`language` <- `language_object`
      }
      if (!is.null(this_object$`operation`)) {
        `operation_object` <- BatchOperation$new()
        `operation_object`$fromJSON(jsonlite::toJSON(this_object$`operation`, auto_unbox = TRUE, digits = NA))
        self$`operation` <- `operation_object`
      }
      if (!is.null(this_object$`items`)) {
        self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[ItemUpdateBatchRecord]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsItemsUpdateBatchRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`country`)) {
          sprintf(
          '"country":
          %s
          ',
          jsonlite::toJSON(self$`country`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`language`)) {
          sprintf(
          '"language":
          %s
          ',
          jsonlite::toJSON(self$`language`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`operation`)) {
          sprintf(
          '"operation":
          %s
          ',
          jsonlite::toJSON(self$`operation`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`items`)) {
          sprintf(
          '"items":
          [%s]
',
          paste(sapply(self$`items`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CatalogsItemsUpdateBatchRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsItemsUpdateBatchRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsItemsUpdateBatchRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`country` <- Country$new()$fromJSON(jsonlite::toJSON(this_object$`country`, auto_unbox = TRUE, digits = NA))
      self$`language` <- Language$new()$fromJSON(jsonlite::toJSON(this_object$`language`, auto_unbox = TRUE, digits = NA))
      self$`operation` <- BatchOperation$new()$fromJSON(jsonlite::toJSON(this_object$`operation`, auto_unbox = TRUE, digits = NA))
      self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[ItemUpdateBatchRecord]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to CatalogsItemsUpdateBatchRequest
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsItemsUpdateBatchRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `country`
      if (!is.null(input_json$`country`)) {
        stopifnot(R6::is.R6(input_json$`country`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsItemsUpdateBatchRequest: the required field `country` is missing."))
      }
      # check the required field `language`
      if (!is.null(input_json$`language`)) {
        stopifnot(R6::is.R6(input_json$`language`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsItemsUpdateBatchRequest: the required field `language` is missing."))
      }
      # check the required field `operation`
      if (!is.null(input_json$`operation`)) {
        stopifnot(R6::is.R6(input_json$`operation`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsItemsUpdateBatchRequest: the required field `operation` is missing."))
      }
      # check the required field `items`
      if (!is.null(input_json$`items`)) {
        stopifnot(is.vector(input_json$`items`), length(input_json$`items`) != 0)
        tmp <- sapply(input_json$`items`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsItemsUpdateBatchRequest: the required field `items` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsItemsUpdateBatchRequest
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
      # check if the required `country` is null
      if (is.null(self$`country`)) {
        return(FALSE)
      }

      # check if the required `language` is null
      if (is.null(self$`language`)) {
        return(FALSE)
      }

      # check if the required `operation` is null
      if (is.null(self$`operation`)) {
        return(FALSE)
      }

      # check if the required `items` is null
      if (is.null(self$`items`)) {
        return(FALSE)
      }

      if (length(self$`items`) > 1000) {
        return(FALSE)
      }
      if (length(self$`items`) < 1) {
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
      # check if the required `country` is null
      if (is.null(self$`country`)) {
        invalid_fields["country"] <- "Non-nullable required field `country` cannot be null."
      }

      # check if the required `language` is null
      if (is.null(self$`language`)) {
        invalid_fields["language"] <- "Non-nullable required field `language` cannot be null."
      }

      # check if the required `operation` is null
      if (is.null(self$`operation`)) {
        invalid_fields["operation"] <- "Non-nullable required field `operation` cannot be null."
      }

      # check if the required `items` is null
      if (is.null(self$`items`)) {
        invalid_fields["items"] <- "Non-nullable required field `items` cannot be null."
      }

      if (length(self$`items`) > 1000) {
        invalid_fields["items"] <- "Invalid length for `items`, number of items must be less than or equal to 1000."
      }
      if (length(self$`items`) < 1) {
        invalid_fields["items"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# CatalogsItemsUpdateBatchRequest$unlock()
#
## Below is an example to define the print function
# CatalogsItemsUpdateBatchRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsItemsUpdateBatchRequest$lock()

