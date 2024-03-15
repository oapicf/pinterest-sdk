#' Create a new CatalogsRetailBatchRequest
#'
#' @description
#' A request object that can have multiple operations on a single retail batch
#'
#' @docType class
#' @title CatalogsRetailBatchRequest
#' @description CatalogsRetailBatchRequest Class
#' @format An \code{R6Class} generator object
#' @field catalog_type  \link{CatalogsType}
#' @field country  \link{Country}
#' @field language  \link{Language}
#' @field items Array with catalogs item operations list(\link{CatalogsRetailBatchRequestItemsInner})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsRetailBatchRequest <- R6::R6Class(
  "CatalogsRetailBatchRequest",
  public = list(
    `catalog_type` = NULL,
    `country` = NULL,
    `language` = NULL,
    `items` = NULL,
    #' Initialize a new CatalogsRetailBatchRequest class.
    #'
    #' @description
    #' Initialize a new CatalogsRetailBatchRequest class.
    #'
    #' @param catalog_type catalog_type
    #' @param country country
    #' @param language language
    #' @param items Array with catalogs item operations
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`catalog_type`, `country`, `language`, `items`, ...) {
      if (!missing(`catalog_type`)) {
        if (!(`catalog_type` %in% c())) {
          stop(paste("Error! \"", `catalog_type`, "\" cannot be assigned to `catalog_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`catalog_type`))
        self$`catalog_type` <- `catalog_type`
      }
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
    #' @return CatalogsRetailBatchRequest in JSON format
    #' @export
    toJSON = function() {
      CatalogsRetailBatchRequestObject <- list()
      if (!is.null(self$`catalog_type`)) {
        CatalogsRetailBatchRequestObject[["catalog_type"]] <-
          self$`catalog_type`$toJSON()
      }
      if (!is.null(self$`country`)) {
        CatalogsRetailBatchRequestObject[["country"]] <-
          self$`country`$toJSON()
      }
      if (!is.null(self$`language`)) {
        CatalogsRetailBatchRequestObject[["language"]] <-
          self$`language`$toJSON()
      }
      if (!is.null(self$`items`)) {
        CatalogsRetailBatchRequestObject[["items"]] <-
          lapply(self$`items`, function(x) x$toJSON())
      }
      CatalogsRetailBatchRequestObject
    },
    #' Deserialize JSON string into an instance of CatalogsRetailBatchRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsRetailBatchRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsRetailBatchRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`)) {
        `catalog_type_object` <- CatalogsType$new()
        `catalog_type_object`$fromJSON(jsonlite::toJSON(this_object$`catalog_type`, auto_unbox = TRUE, digits = NA))
        self$`catalog_type` <- `catalog_type_object`
      }
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
      if (!is.null(this_object$`items`)) {
        self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[CatalogsRetailBatchRequestItemsInner]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsRetailBatchRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`catalog_type`)) {
          sprintf(
          '"catalog_type":
          %s
          ',
          jsonlite::toJSON(self$`catalog_type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
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
    #' Deserialize JSON string into an instance of CatalogsRetailBatchRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsRetailBatchRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsRetailBatchRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`catalog_type` <- CatalogsType$new()$fromJSON(jsonlite::toJSON(this_object$`catalog_type`, auto_unbox = TRUE, digits = NA))
      self$`country` <- Country$new()$fromJSON(jsonlite::toJSON(this_object$`country`, auto_unbox = TRUE, digits = NA))
      self$`language` <- Language$new()$fromJSON(jsonlite::toJSON(this_object$`language`, auto_unbox = TRUE, digits = NA))
      self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[CatalogsRetailBatchRequestItemsInner]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to CatalogsRetailBatchRequest
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsRetailBatchRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `catalog_type`
      if (!is.null(input_json$`catalog_type`)) {
        stopifnot(R6::is.R6(input_json$`catalog_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailBatchRequest: the required field `catalog_type` is missing."))
      }
      # check the required field `country`
      if (!is.null(input_json$`country`)) {
        stopifnot(R6::is.R6(input_json$`country`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailBatchRequest: the required field `country` is missing."))
      }
      # check the required field `language`
      if (!is.null(input_json$`language`)) {
        stopifnot(R6::is.R6(input_json$`language`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailBatchRequest: the required field `language` is missing."))
      }
      # check the required field `items`
      if (!is.null(input_json$`items`)) {
        stopifnot(is.vector(input_json$`items`), length(input_json$`items`) != 0)
        tmp <- sapply(input_json$`items`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailBatchRequest: the required field `items` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsRetailBatchRequest
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
      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
        return(FALSE)
      }

      # check if the required `country` is null
      if (is.null(self$`country`)) {
        return(FALSE)
      }

      # check if the required `language` is null
      if (is.null(self$`language`)) {
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
      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
        invalid_fields["catalog_type"] <- "Non-nullable required field `catalog_type` cannot be null."
      }

      # check if the required `country` is null
      if (is.null(self$`country`)) {
        invalid_fields["country"] <- "Non-nullable required field `country` cannot be null."
      }

      # check if the required `language` is null
      if (is.null(self$`language`)) {
        invalid_fields["language"] <- "Non-nullable required field `language` cannot be null."
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
# CatalogsRetailBatchRequest$unlock()
#
## Below is an example to define the print function
# CatalogsRetailBatchRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsRetailBatchRequest$lock()

