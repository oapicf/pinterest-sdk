#' @docType class
#' @title CatalogsProductGroupsList200ResponseAllOfItemsInner
#'
#' @description CatalogsProductGroupsList200ResponseAllOfItemsInner Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsProductGroupsList200ResponseAllOfItemsInner <- R6::R6Class(
  "CatalogsProductGroupsList200ResponseAllOfItemsInner",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field any_of  a list of object types defined in the anyOf schema.
    any_of = list("CatalogsProductGroup", "CatalogsVerticalProductGroup"),
    #' Initialize a new CatalogsProductGroupsList200ResponseAllOfItemsInner.
    #'
    #' @description
    #' Initialize a new CatalogsProductGroupsList200ResponseAllOfItemsInner.
    #'
    #' @param instance an instance of the object defined in the anyOf schemas: "CatalogsProductGroup", "CatalogsVerticalProductGroup"
    #' @export
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsProductGroup") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsProductGroup"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsVerticalProductGroup") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsVerticalProductGroup"
      } else {
        stop(paste("Failed to initialize CatalogsProductGroupsList200ResponseAllOfItemsInner with anyOf schemas CatalogsProductGroup, CatalogsVerticalProductGroup. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },
    #' Deserialize JSON string into an instance of CatalogsProductGroupsList200ResponseAllOfItemsInner.
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupsList200ResponseAllOfItemsInner.
    #' An alias to the method `fromJSON`.
    #'
    #' @param input The input JSON.
    #' @return An instance of CatalogsProductGroupsList200ResponseAllOfItemsInner.
    #' @export
    fromJSONString = function(input) {
      self$fromJSON(input)
    },
    #' Deserialize JSON string into an instance of CatalogsProductGroupsList200ResponseAllOfItemsInner.
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupsList200ResponseAllOfItemsInner.
    #'
    #' @param input The input JSON.
    #' @return An instance of CatalogsProductGroupsList200ResponseAllOfItemsInner.
    #' @export
    fromJSON = function(input) {
      error_messages <- list()

      `CatalogsProductGroup_result` <- tryCatch({
          `CatalogsProductGroup`$public_methods$validateJSON(input)
          `CatalogsProductGroup_instance` <- `CatalogsProductGroup`$new()
          self$actual_instance <- `CatalogsProductGroup_instance`$fromJSON(input)
          self$actual_type <- "CatalogsProductGroup"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsProductGroup_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsProductGroup_result`["message"])
      }

      `CatalogsVerticalProductGroup_result` <- tryCatch({
          `CatalogsVerticalProductGroup`$public_methods$validateJSON(input)
          `CatalogsVerticalProductGroup_instance` <- `CatalogsVerticalProductGroup`$new()
          self$actual_instance <- `CatalogsVerticalProductGroup_instance`$fromJSON(input)
          self$actual_type <- "CatalogsVerticalProductGroup"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsVerticalProductGroup_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsVerticalProductGroup_result`["message"])
      }

      # no match
      stop(paste("No match found when deserializing the input into CatalogsProductGroupsList200ResponseAllOfItemsInner with anyOf schemas CatalogsProductGroup, CatalogsVerticalProductGroup. Details: >>",
                 paste(error_messages, collapse = " >> ")))
    },
    #' Serialize CatalogsProductGroupsList200ResponseAllOfItemsInner to JSON string.
    #'
    #' @description
    #' Serialize CatalogsProductGroupsList200ResponseAllOfItemsInner to JSON string.
    #'
    #' @return JSON string representation of the CatalogsProductGroupsList200ResponseAllOfItemsInner.
    #' @export
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify((self$actual_instance$toJSONString())))
      } else {
        NULL
      }
    },
    #' Serialize CatalogsProductGroupsList200ResponseAllOfItemsInner to JSON.
    #'
    #' @description
    #' Serialize CatalogsProductGroupsList200ResponseAllOfItemsInner to JSON.
    #'
    #' @return JSON representation of the CatalogsProductGroupsList200ResponseAllOfItemsInner.
    #' @export
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },
    #' Validate the input JSON with respect to CatalogsProductGroupsList200ResponseAllOfItemsInner.
    #'
    #' @description
    #' Validate the input JSON with respect to CatalogsProductGroupsList200ResponseAllOfItemsInner and
    #' throw exception if invalid.
    #'
    #' @param input The input JSON.
    #' @export
    validateJSON = function(input) {
      # backup current values
      actual_instance_bak <- self$actual_instance
      actual_type_bak <- self$actual_type

      # if it's not valid, an error will be thrown
      self$fromJSON(input)

      # no error thrown, restore old values
      self$actual_instance <- actual_instance_bak
      self$actual_type <- actual_type_bak
    },
    #' Returns the string representation of the instance.
    #'
    #' @description
    #' Returns the string representation of the instance.
    #'
    #' @return The string representation of the instance.
    #' @export
    toString = function() {
      jsoncontent <- c(
        sprintf('"actual_instance": %s', if (is.null(self$actual_instance)) NULL else self$actual_instance$toJSONString()),
        sprintf('"actual_type": "%s"', self$actual_type),
        sprintf('"any_of": "%s"', paste(unlist(self$any_of), collapse = ", "))
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      as.character(jsonlite::prettify(paste("{", jsoncontent, "}", sep = "")))
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
#CatalogsProductGroupsList200ResponseAllOfItemsInner$unlock()
#
## Below is an example to define the print function
#CatalogsProductGroupsList200ResponseAllOfItemsInner$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#CatalogsProductGroupsList200ResponseAllOfItemsInner$lock()

