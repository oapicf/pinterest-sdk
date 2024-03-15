#' Create a new DeliveryMetricsResponseItemsInner
#'
#' @description
#' DeliveryMetricsResponseItemsInner Class
#'
#' @docType class
#' @title DeliveryMetricsResponseItemsInner
#' @description DeliveryMetricsResponseItemsInner Class
#' @format An \code{R6Class} generator object
#' @field name Metric's name. character [optional]
#' @field category Category name character [optional]
#' @field definition How the metric is defined. character [optional]
#' @field display_name Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DeliveryMetricsResponseItemsInner <- R6::R6Class(
  "DeliveryMetricsResponseItemsInner",
  public = list(
    `name` = NULL,
    `category` = NULL,
    `definition` = NULL,
    `display_name` = NULL,
    #' Initialize a new DeliveryMetricsResponseItemsInner class.
    #'
    #' @description
    #' Initialize a new DeliveryMetricsResponseItemsInner class.
    #'
    #' @param name Metric's name.
    #' @param category Category name
    #' @param definition How the metric is defined.
    #' @param display_name Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`name` = NULL, `category` = NULL, `definition` = NULL, `display_name` = NULL, ...) {
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`category`)) {
        if (!(`category` %in% c("ADS", "ORGANIC"))) {
          stop(paste("Error! \"", `category`, "\" cannot be assigned to `category`. Must be \"ADS\", \"ORGANIC\".", sep = ""))
        }
        if (!(is.character(`category`) && length(`category`) == 1)) {
          stop(paste("Error! Invalid data for `category`. Must be a string:", `category`))
        }
        self$`category` <- `category`
      }
      if (!is.null(`definition`)) {
        if (!(is.character(`definition`) && length(`definition`) == 1)) {
          stop(paste("Error! Invalid data for `definition`. Must be a string:", `definition`))
        }
        self$`definition` <- `definition`
      }
      if (!is.null(`display_name`)) {
        if (!(is.character(`display_name`) && length(`display_name`) == 1)) {
          stop(paste("Error! Invalid data for `display_name`. Must be a string:", `display_name`))
        }
        self$`display_name` <- `display_name`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return DeliveryMetricsResponseItemsInner in JSON format
    #' @export
    toJSON = function() {
      DeliveryMetricsResponseItemsInnerObject <- list()
      if (!is.null(self$`name`)) {
        DeliveryMetricsResponseItemsInnerObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`category`)) {
        DeliveryMetricsResponseItemsInnerObject[["category"]] <-
          self$`category`
      }
      if (!is.null(self$`definition`)) {
        DeliveryMetricsResponseItemsInnerObject[["definition"]] <-
          self$`definition`
      }
      if (!is.null(self$`display_name`)) {
        DeliveryMetricsResponseItemsInnerObject[["display_name"]] <-
          self$`display_name`
      }
      DeliveryMetricsResponseItemsInnerObject
    },
    #' Deserialize JSON string into an instance of DeliveryMetricsResponseItemsInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of DeliveryMetricsResponseItemsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeliveryMetricsResponseItemsInner
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`category`)) {
        if (!is.null(this_object$`category`) && !(this_object$`category` %in% c("ADS", "ORGANIC"))) {
          stop(paste("Error! \"", this_object$`category`, "\" cannot be assigned to `category`. Must be \"ADS\", \"ORGANIC\".", sep = ""))
        }
        self$`category` <- this_object$`category`
      }
      if (!is.null(this_object$`definition`)) {
        self$`definition` <- this_object$`definition`
      }
      if (!is.null(this_object$`display_name`)) {
        self$`display_name` <- this_object$`display_name`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return DeliveryMetricsResponseItemsInner in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`category`)) {
          sprintf(
          '"category":
            "%s"
                    ',
          self$`category`
          )
        },
        if (!is.null(self$`definition`)) {
          sprintf(
          '"definition":
            "%s"
                    ',
          self$`definition`
          )
        },
        if (!is.null(self$`display_name`)) {
          sprintf(
          '"display_name":
            "%s"
                    ',
          self$`display_name`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of DeliveryMetricsResponseItemsInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of DeliveryMetricsResponseItemsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeliveryMetricsResponseItemsInner
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      if (!is.null(this_object$`category`) && !(this_object$`category` %in% c("ADS", "ORGANIC"))) {
        stop(paste("Error! \"", this_object$`category`, "\" cannot be assigned to `category`. Must be \"ADS\", \"ORGANIC\".", sep = ""))
      }
      self$`category` <- this_object$`category`
      self$`definition` <- this_object$`definition`
      self$`display_name` <- this_object$`display_name`
      self
    },
    #' Validate JSON input with respect to DeliveryMetricsResponseItemsInner
    #'
    #' @description
    #' Validate JSON input with respect to DeliveryMetricsResponseItemsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of DeliveryMetricsResponseItemsInner
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
# DeliveryMetricsResponseItemsInner$unlock()
#
## Below is an example to define the print function
# DeliveryMetricsResponseItemsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DeliveryMetricsResponseItemsInner$lock()

