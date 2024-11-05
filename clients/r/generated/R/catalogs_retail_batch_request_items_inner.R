#' @docType class
#' @title CatalogsRetailBatchRequestItemsInner
#'
#' @description CatalogsRetailBatchRequestItemsInner Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsRetailBatchRequestItemsInner <- R6::R6Class(
  "CatalogsRetailBatchRequestItemsInner",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field any_of  a list of object types defined in the anyOf schema.
    any_of = list("CatalogsCreateRetailItem", "CatalogsDeleteRetailItem", "CatalogsUpdateRetailItem", "CatalogsUpsertRetailItem"),

    #' @description
    #' Initialize a new CatalogsRetailBatchRequestItemsInner.
    #'
    #' @param instance an instance of the object defined in the anyOf schemas: "CatalogsCreateRetailItem", "CatalogsDeleteRetailItem", "CatalogsUpdateRetailItem", "CatalogsUpsertRetailItem"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsCreateRetailItem") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsCreateRetailItem"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsDeleteRetailItem") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsDeleteRetailItem"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsUpdateRetailItem") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsUpdateRetailItem"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsUpsertRetailItem") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsUpsertRetailItem"
      } else {
        stop(paste("Failed to initialize CatalogsRetailBatchRequestItemsInner with anyOf schemas CatalogsCreateRetailItem, CatalogsDeleteRetailItem, CatalogsUpdateRetailItem, CatalogsUpsertRetailItem. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsRetailBatchRequestItemsInner.
    #' An alias to the method `fromJSON`.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsRetailBatchRequestItemsInner.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsRetailBatchRequestItemsInner.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsRetailBatchRequestItemsInner.
    fromJSON = function(input) {
      error_messages <- list()

      `CatalogsCreateRetailItem_result` <- tryCatch({
          `CatalogsCreateRetailItem`$public_methods$validateJSON(input)
          `CatalogsCreateRetailItem_instance` <- `CatalogsCreateRetailItem`$new()
          self$actual_instance <- `CatalogsCreateRetailItem_instance`$fromJSON(input)
          self$actual_type <- "CatalogsCreateRetailItem"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsCreateRetailItem_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsCreateRetailItem_result`["message"])
      }

      `CatalogsUpdateRetailItem_result` <- tryCatch({
          `CatalogsUpdateRetailItem`$public_methods$validateJSON(input)
          `CatalogsUpdateRetailItem_instance` <- `CatalogsUpdateRetailItem`$new()
          self$actual_instance <- `CatalogsUpdateRetailItem_instance`$fromJSON(input)
          self$actual_type <- "CatalogsUpdateRetailItem"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsUpdateRetailItem_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsUpdateRetailItem_result`["message"])
      }

      `CatalogsUpsertRetailItem_result` <- tryCatch({
          `CatalogsUpsertRetailItem`$public_methods$validateJSON(input)
          `CatalogsUpsertRetailItem_instance` <- `CatalogsUpsertRetailItem`$new()
          self$actual_instance <- `CatalogsUpsertRetailItem_instance`$fromJSON(input)
          self$actual_type <- "CatalogsUpsertRetailItem"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsUpsertRetailItem_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsUpsertRetailItem_result`["message"])
      }

      `CatalogsDeleteRetailItem_result` <- tryCatch({
          `CatalogsDeleteRetailItem`$public_methods$validateJSON(input)
          `CatalogsDeleteRetailItem_instance` <- `CatalogsDeleteRetailItem`$new()
          self$actual_instance <- `CatalogsDeleteRetailItem_instance`$fromJSON(input)
          self$actual_type <- "CatalogsDeleteRetailItem"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsDeleteRetailItem_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsDeleteRetailItem_result`["message"])
      }

      # no match
      stop(paste("No match found when deserializing the input into CatalogsRetailBatchRequestItemsInner with anyOf schemas CatalogsCreateRetailItem, CatalogsDeleteRetailItem, CatalogsUpdateRetailItem, CatalogsUpsertRetailItem. Details: >>",
                 paste(error_messages, collapse = " >> ")))
    },

    #' @description
    #' Serialize CatalogsRetailBatchRequestItemsInner to JSON string.
    #'
    #' @return JSON string representation of the CatalogsRetailBatchRequestItemsInner.
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify((self$actual_instance$toJSONString())))
      } else {
        NULL
      }
    },

    #' @description
    #' Serialize CatalogsRetailBatchRequestItemsInner to JSON.
    #'
    #' @return JSON representation of the CatalogsRetailBatchRequestItemsInner.
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },

    #' @description
    #' Validate the input JSON with respect to CatalogsRetailBatchRequestItemsInner and
    #' throw exception if invalid.
    #'
    #' @param input The input JSON.
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

    #' @description
    #' Returns the string representation of the instance.
    #'
    #' @return The string representation of the instance.
    toString = function() {
      jsoncontent <- c(
        sprintf('"actual_instance": %s', if (is.null(self$actual_instance)) NULL else self$actual_instance$toJSONString()),
        sprintf('"actual_type": "%s"', self$actual_type),
        sprintf('"any_of": "%s"', paste(unlist(self$any_of), collapse = ", "))
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      as.character(jsonlite::prettify(paste("{", jsoncontent, "}", sep = "")))
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
#CatalogsRetailBatchRequestItemsInner$unlock()
#
## Below is an example to define the print function
#CatalogsRetailBatchRequestItemsInner$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#CatalogsRetailBatchRequestItemsInner$lock()

