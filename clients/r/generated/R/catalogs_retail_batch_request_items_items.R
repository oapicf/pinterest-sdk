#' @docType class
#' @title CatalogsRetailBatchRequestItemsItems
#'
#' @description CatalogsRetailBatchRequestItemsItems Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsRetailBatchRequestItemsItems <- R6::R6Class(
  "CatalogsRetailBatchRequestItemsItems",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("CatalogsCreateRetailItem", "CatalogsDeleteRetailItem", "CatalogsUpdateRetailItem", "CatalogsUpsertRetailItem"),

    #' @description
    #' Initialize a new CatalogsRetailBatchRequestItemsItems.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "CatalogsCreateRetailItem", "CatalogsDeleteRetailItem", "CatalogsUpdateRetailItem", "CatalogsUpsertRetailItem"
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
        stop(paste("Failed to initialize CatalogsRetailBatchRequestItemsItems with oneOf schemas CatalogsCreateRetailItem, CatalogsDeleteRetailItem, CatalogsUpdateRetailItem, CatalogsUpsertRetailItem. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsRetailBatchRequestItemsItems.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsRetailBatchRequestItemsItems.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsRetailBatchRequestItemsItems.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsRetailBatchRequestItemsItems.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `CatalogsCreateRetailItem_result` <- tryCatch({
          `CatalogsCreateRetailItem`$public_methods$validateJSON(input)
          `CatalogsCreateRetailItem_instance` <- `CatalogsCreateRetailItem`$new()
          instance <- `CatalogsCreateRetailItem_instance`$fromJSON(input)
          instance_type <- "CatalogsCreateRetailItem"
          matched_schemas <- append(matched_schemas, "CatalogsCreateRetailItem")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsCreateRetailItem_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsCreateRetailItem_result`["message"])
      }

      `CatalogsUpdateRetailItem_result` <- tryCatch({
          `CatalogsUpdateRetailItem`$public_methods$validateJSON(input)
          `CatalogsUpdateRetailItem_instance` <- `CatalogsUpdateRetailItem`$new()
          instance <- `CatalogsUpdateRetailItem_instance`$fromJSON(input)
          instance_type <- "CatalogsUpdateRetailItem"
          matched_schemas <- append(matched_schemas, "CatalogsUpdateRetailItem")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsUpdateRetailItem_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsUpdateRetailItem_result`["message"])
      }

      `CatalogsUpsertRetailItem_result` <- tryCatch({
          `CatalogsUpsertRetailItem`$public_methods$validateJSON(input)
          `CatalogsUpsertRetailItem_instance` <- `CatalogsUpsertRetailItem`$new()
          instance <- `CatalogsUpsertRetailItem_instance`$fromJSON(input)
          instance_type <- "CatalogsUpsertRetailItem"
          matched_schemas <- append(matched_schemas, "CatalogsUpsertRetailItem")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsUpsertRetailItem_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsUpsertRetailItem_result`["message"])
      }

      `CatalogsDeleteRetailItem_result` <- tryCatch({
          `CatalogsDeleteRetailItem`$public_methods$validateJSON(input)
          `CatalogsDeleteRetailItem_instance` <- `CatalogsDeleteRetailItem`$new()
          instance <- `CatalogsDeleteRetailItem_instance`$fromJSON(input)
          instance_type <- "CatalogsDeleteRetailItem"
          matched_schemas <- append(matched_schemas, "CatalogsDeleteRetailItem")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsDeleteRetailItem_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsDeleteRetailItem_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into CatalogsRetailBatchRequestItemsItems with oneOf schemas CatalogsCreateRetailItem, CatalogsDeleteRetailItem, CatalogsUpdateRetailItem, CatalogsUpsertRetailItem. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into CatalogsRetailBatchRequestItemsItems with oneOf schemas CatalogsCreateRetailItem, CatalogsDeleteRetailItem, CatalogsUpdateRetailItem, CatalogsUpsertRetailItem. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize CatalogsRetailBatchRequestItemsItems to JSON string.
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return JSON string representation of the CatalogsRetailBatchRequestItemsItems.
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      if (!is.null(self$actual_instance)) {
        json <- jsonlite::toJSON(simple, auto_unbox = TRUE, ...)
        return(as.character(jsonlite::minify(json)))
      } else {
        return(NULL)
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert CatalogsRetailBatchRequestItemsItems to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      if (!is.null(self$actual_instance)) {
        return(self$actual_instance$toSimpleType())
      } else {
        return(NULL)
      }
    },

    #' @description
    #' Validate the input JSON with respect to CatalogsRetailBatchRequestItemsItems and
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
        sprintf('"one_of": "%s"', paste(unlist(self$one_of), collapse = ", "))
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
#CatalogsRetailBatchRequestItemsItems$unlock()
#
## Below is an example to define the print function
#CatalogsRetailBatchRequestItemsItems$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#CatalogsRetailBatchRequestItemsItems$lock()

