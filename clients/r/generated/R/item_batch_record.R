#' @docType class
#' @title ItemBatchRecord
#'
#' @description ItemBatchRecord Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ItemBatchRecord <- R6::R6Class(
  "ItemBatchRecord",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("ItemCreateBatchRecord", "ItemDeleteBatchRecord", "ItemDeleteDiscontinuedBatchRecord", "ItemUpdateBatchRecord", "ItemUpsertBatchRecord"),
    #' Initialize a new ItemBatchRecord.
    #'
    #' @description
    #' Initialize a new ItemBatchRecord.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "ItemCreateBatchRecord", "ItemDeleteBatchRecord", "ItemDeleteDiscontinuedBatchRecord", "ItemUpdateBatchRecord", "ItemUpsertBatchRecord"
    #' @export
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "ItemCreateBatchRecord") {
        self$actual_instance <- instance
        self$actual_type <- "ItemCreateBatchRecord"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "ItemDeleteBatchRecord") {
        self$actual_instance <- instance
        self$actual_type <- "ItemDeleteBatchRecord"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "ItemDeleteDiscontinuedBatchRecord") {
        self$actual_instance <- instance
        self$actual_type <- "ItemDeleteDiscontinuedBatchRecord"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "ItemUpdateBatchRecord") {
        self$actual_instance <- instance
        self$actual_type <- "ItemUpdateBatchRecord"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "ItemUpsertBatchRecord") {
        self$actual_instance <- instance
        self$actual_type <- "ItemUpsertBatchRecord"
      } else {
        stop(paste("Failed to initialize ItemBatchRecord with oneOf schemas ItemCreateBatchRecord, ItemDeleteBatchRecord, ItemDeleteDiscontinuedBatchRecord, ItemUpdateBatchRecord, ItemUpsertBatchRecord. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },
    #' Deserialize JSON string into an instance of ItemBatchRecord.
    #'
    #' @description
    #' Deserialize JSON string into an instance of ItemBatchRecord.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #' @return An instance of ItemBatchRecord.
    #' @export
    fromJSONString = function(input) {
      self$fromJSON(input)
    },
    #' Deserialize JSON string into an instance of ItemBatchRecord.
    #'
    #' @description
    #' Deserialize JSON string into an instance of ItemBatchRecord.
    #'
    #' @param input The input JSON.
    #' @return An instance of ItemBatchRecord.
    #' @export
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `ItemCreateBatchRecord_result` <- tryCatch({
          `ItemCreateBatchRecord`$public_methods$validateJSON(input)
          `ItemCreateBatchRecord_instance` <- `ItemCreateBatchRecord`$new()
          instance <- `ItemCreateBatchRecord_instance`$fromJSON(input)
          instance_type <- "ItemCreateBatchRecord"
          matched_schemas <- append(matched_schemas, "ItemCreateBatchRecord")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`ItemCreateBatchRecord_result`["error"])) {
        error_messages <- append(error_messages, `ItemCreateBatchRecord_result`["message"])
      }

      `ItemDeleteDiscontinuedBatchRecord_result` <- tryCatch({
          `ItemDeleteDiscontinuedBatchRecord`$public_methods$validateJSON(input)
          `ItemDeleteDiscontinuedBatchRecord_instance` <- `ItemDeleteDiscontinuedBatchRecord`$new()
          instance <- `ItemDeleteDiscontinuedBatchRecord_instance`$fromJSON(input)
          instance_type <- "ItemDeleteDiscontinuedBatchRecord"
          matched_schemas <- append(matched_schemas, "ItemDeleteDiscontinuedBatchRecord")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`ItemDeleteDiscontinuedBatchRecord_result`["error"])) {
        error_messages <- append(error_messages, `ItemDeleteDiscontinuedBatchRecord_result`["message"])
      }

      `ItemUpdateBatchRecord_result` <- tryCatch({
          `ItemUpdateBatchRecord`$public_methods$validateJSON(input)
          `ItemUpdateBatchRecord_instance` <- `ItemUpdateBatchRecord`$new()
          instance <- `ItemUpdateBatchRecord_instance`$fromJSON(input)
          instance_type <- "ItemUpdateBatchRecord"
          matched_schemas <- append(matched_schemas, "ItemUpdateBatchRecord")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`ItemUpdateBatchRecord_result`["error"])) {
        error_messages <- append(error_messages, `ItemUpdateBatchRecord_result`["message"])
      }

      `ItemUpsertBatchRecord_result` <- tryCatch({
          `ItemUpsertBatchRecord`$public_methods$validateJSON(input)
          `ItemUpsertBatchRecord_instance` <- `ItemUpsertBatchRecord`$new()
          instance <- `ItemUpsertBatchRecord_instance`$fromJSON(input)
          instance_type <- "ItemUpsertBatchRecord"
          matched_schemas <- append(matched_schemas, "ItemUpsertBatchRecord")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`ItemUpsertBatchRecord_result`["error"])) {
        error_messages <- append(error_messages, `ItemUpsertBatchRecord_result`["message"])
      }

      `ItemDeleteBatchRecord_result` <- tryCatch({
          `ItemDeleteBatchRecord`$public_methods$validateJSON(input)
          `ItemDeleteBatchRecord_instance` <- `ItemDeleteBatchRecord`$new()
          instance <- `ItemDeleteBatchRecord_instance`$fromJSON(input)
          instance_type <- "ItemDeleteBatchRecord"
          matched_schemas <- append(matched_schemas, "ItemDeleteBatchRecord")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`ItemDeleteBatchRecord_result`["error"])) {
        error_messages <- append(error_messages, `ItemDeleteBatchRecord_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into ItemBatchRecord with oneOf schemas ItemCreateBatchRecord, ItemDeleteBatchRecord, ItemDeleteDiscontinuedBatchRecord, ItemUpdateBatchRecord, ItemUpsertBatchRecord. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into ItemBatchRecord with oneOf schemas ItemCreateBatchRecord, ItemDeleteBatchRecord, ItemDeleteDiscontinuedBatchRecord, ItemUpdateBatchRecord, ItemUpsertBatchRecord. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },
    #' Serialize ItemBatchRecord to JSON string.
    #'
    #' @description
    #' Serialize ItemBatchRecord to JSON string.
    #'
    #' @return JSON string representation of the ItemBatchRecord.
    #' @export
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify(self$actual_instance$toJSONString()))
      } else {
        NULL
      }
    },
    #' Serialize ItemBatchRecord to JSON.
    #'
    #' @description
    #' Serialize ItemBatchRecord to JSON.
    #'
    #' @return JSON representation of the ItemBatchRecord.
    #' @export
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },
    #' Validate the input JSON with respect to ItemBatchRecord.
    #'
    #' @description
    #' Validate the input JSON with respect to ItemBatchRecord and
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
        sprintf('"one_of": "%s"', paste(unlist(self$one_of), collapse = ", "))
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
#ItemBatchRecord$unlock()
#
## Below is an example to define the print function
#ItemBatchRecord$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#ItemBatchRecord$lock()

