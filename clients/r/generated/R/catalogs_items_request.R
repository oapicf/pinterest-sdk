#' Create a new CatalogsItemsRequest
#'
#' @description
#' Request object of catalogs items
#'
#' @docType class
#' @title CatalogsItemsRequest
#' @description CatalogsItemsRequest Class
#' @format An \code{R6Class} generator object
#' @field country  \link{Country}
#' @field language  \link{CatalogsItemsRequestLanguage}
#' @field filters  \link{CatalogsItemsPostFilters}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsItemsRequest <- R6::R6Class(
  "CatalogsItemsRequest",
  public = list(
    `country` = NULL,
    `language` = NULL,
    `filters` = NULL,

    #' @description
    #' Initialize a new CatalogsItemsRequest class.
    #'
    #' @param country country
    #' @param language language
    #' @param filters filters
    #' @param ... Other optional arguments.
    initialize = function(`country`, `language`, `filters`, ...) {
      if (!missing(`country`)) {
        if (!(`country` %in% c())) {
          stop(paste("Error! \"", `country`, "\" cannot be assigned to `country`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`country`))
        self$`country` <- `country`
      }
      if (!missing(`language`)) {
        stopifnot(R6::is.R6(`language`))
        self$`language` <- `language`
      }
      if (!missing(`filters`)) {
        stopifnot(R6::is.R6(`filters`))
        self$`filters` <- `filters`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsItemsRequest in JSON format
    toJSON = function() {
      CatalogsItemsRequestObject <- list()
      if (!is.null(self$`country`)) {
        CatalogsItemsRequestObject[["country"]] <-
          self$`country`$toJSON()
      }
      if (!is.null(self$`language`)) {
        CatalogsItemsRequestObject[["language"]] <-
          self$`language`$toJSON()
      }
      if (!is.null(self$`filters`)) {
        CatalogsItemsRequestObject[["filters"]] <-
          self$`filters`$toJSON()
      }
      CatalogsItemsRequestObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsItemsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsItemsRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`country`)) {
        `country_object` <- Country$new()
        `country_object`$fromJSON(jsonlite::toJSON(this_object$`country`, auto_unbox = TRUE, digits = NA))
        self$`country` <- `country_object`
      }
      if (!is.null(this_object$`language`)) {
        `language_object` <- CatalogsItemsRequestLanguage$new()
        `language_object`$fromJSON(jsonlite::toJSON(this_object$`language`, auto_unbox = TRUE, digits = NA))
        self$`language` <- `language_object`
      }
      if (!is.null(this_object$`filters`)) {
        `filters_object` <- CatalogsItemsPostFilters$new()
        `filters_object`$fromJSON(jsonlite::toJSON(this_object$`filters`, auto_unbox = TRUE, digits = NA))
        self$`filters` <- `filters_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsItemsRequest in JSON format
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
        if (!is.null(self$`filters`)) {
          sprintf(
          '"filters":
          %s
          ',
          jsonlite::toJSON(self$`filters`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsItemsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsItemsRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`country` <- Country$new()$fromJSON(jsonlite::toJSON(this_object$`country`, auto_unbox = TRUE, digits = NA))
      self$`language` <- CatalogsItemsRequestLanguage$new()$fromJSON(jsonlite::toJSON(this_object$`language`, auto_unbox = TRUE, digits = NA))
      self$`filters` <- CatalogsItemsPostFilters$new()$fromJSON(jsonlite::toJSON(this_object$`filters`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsItemsRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `country`
      if (!is.null(input_json$`country`)) {
        stopifnot(R6::is.R6(input_json$`country`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsItemsRequest: the required field `country` is missing."))
      }
      # check the required field `language`
      if (!is.null(input_json$`language`)) {
        stopifnot(R6::is.R6(input_json$`language`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsItemsRequest: the required field `language` is missing."))
      }
      # check the required field `filters`
      if (!is.null(input_json$`filters`)) {
        stopifnot(R6::is.R6(input_json$`filters`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsItemsRequest: the required field `filters` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsItemsRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `country` is null
      if (is.null(self$`country`)) {
        return(FALSE)
      }

      # check if the required `language` is null
      if (is.null(self$`language`)) {
        return(FALSE)
      }

      # check if the required `filters` is null
      if (is.null(self$`filters`)) {
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
      # check if the required `country` is null
      if (is.null(self$`country`)) {
        invalid_fields["country"] <- "Non-nullable required field `country` cannot be null."
      }

      # check if the required `language` is null
      if (is.null(self$`language`)) {
        invalid_fields["language"] <- "Non-nullable required field `language` cannot be null."
      }

      # check if the required `filters` is null
      if (is.null(self$`filters`)) {
        invalid_fields["filters"] <- "Non-nullable required field `filters` cannot be null."
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
# CatalogsItemsRequest$unlock()
#
## Below is an example to define the print function
# CatalogsItemsRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsItemsRequest$lock()

