#' Create a new CatalogsListProductsByFeedBasedFilter
#'
#' @description
#' Request object to list products for a given feed_id and product group filter.
#'
#' @docType class
#' @title CatalogsListProductsByFeedBasedFilter
#' @description CatalogsListProductsByFeedBasedFilter Class
#' @format An \code{R6Class} generator object
#' @field feed_id Catalog Feed id pertaining to the catalog product group filter. character
#' @field filters  \link{CatalogsProductGroupFilters}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsListProductsByFeedBasedFilter <- R6::R6Class(
  "CatalogsListProductsByFeedBasedFilter",
  public = list(
    `feed_id` = NULL,
    `filters` = NULL,

    #' @description
    #' Initialize a new CatalogsListProductsByFeedBasedFilter class.
    #'
    #' @param feed_id Catalog Feed id pertaining to the catalog product group filter.
    #' @param filters filters
    #' @param ... Other optional arguments.
    initialize = function(`feed_id`, `filters`, ...) {
      if (!missing(`feed_id`)) {
        if (!(is.character(`feed_id`) && length(`feed_id`) == 1)) {
          stop(paste("Error! Invalid data for `feed_id`. Must be a string:", `feed_id`))
        }
        self$`feed_id` <- `feed_id`
      }
      if (!missing(`filters`)) {
        stopifnot(R6::is.R6(`filters`))
        self$`filters` <- `filters`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsListProductsByFeedBasedFilter in JSON format
    toJSON = function() {
      CatalogsListProductsByFeedBasedFilterObject <- list()
      if (!is.null(self$`feed_id`)) {
        CatalogsListProductsByFeedBasedFilterObject[["feed_id"]] <-
          self$`feed_id`
      }
      if (!is.null(self$`filters`)) {
        CatalogsListProductsByFeedBasedFilterObject[["filters"]] <-
          self$`filters`$toJSON()
      }
      CatalogsListProductsByFeedBasedFilterObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsListProductsByFeedBasedFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsListProductsByFeedBasedFilter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`feed_id`)) {
        self$`feed_id` <- this_object$`feed_id`
      }
      if (!is.null(this_object$`filters`)) {
        `filters_object` <- CatalogsProductGroupFilters$new()
        `filters_object`$fromJSON(jsonlite::toJSON(this_object$`filters`, auto_unbox = TRUE, digits = NA))
        self$`filters` <- `filters_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsListProductsByFeedBasedFilter in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`feed_id`)) {
          sprintf(
          '"feed_id":
            "%s"
                    ',
          self$`feed_id`
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
    #' Deserialize JSON string into an instance of CatalogsListProductsByFeedBasedFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsListProductsByFeedBasedFilter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`feed_id` <- this_object$`feed_id`
      self$`filters` <- CatalogsProductGroupFilters$new()$fromJSON(jsonlite::toJSON(this_object$`filters`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsListProductsByFeedBasedFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `feed_id`
      if (!is.null(input_json$`feed_id`)) {
        if (!(is.character(input_json$`feed_id`) && length(input_json$`feed_id`) == 1)) {
          stop(paste("Error! Invalid data for `feed_id`. Must be a string:", input_json$`feed_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsListProductsByFeedBasedFilter: the required field `feed_id` is missing."))
      }
      # check the required field `filters`
      if (!is.null(input_json$`filters`)) {
        stopifnot(R6::is.R6(input_json$`filters`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsListProductsByFeedBasedFilter: the required field `filters` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsListProductsByFeedBasedFilter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `feed_id` is null
      if (is.null(self$`feed_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`feed_id`, "^\\d+$")) {
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
      # check if the required `feed_id` is null
      if (is.null(self$`feed_id`)) {
        invalid_fields["feed_id"] <- "Non-nullable required field `feed_id` cannot be null."
      }

      if (!str_detect(self$`feed_id`, "^\\d+$")) {
        invalid_fields["feed_id"] <- "Invalid value for `feed_id`, must conform to the pattern ^\\d+$."
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
# CatalogsListProductsByFeedBasedFilter$unlock()
#
## Below is an example to define the print function
# CatalogsListProductsByFeedBasedFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsListProductsByFeedBasedFilter$lock()

