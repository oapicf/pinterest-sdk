#' @docType class
#' @title CatalogsCreativeAssetsBatchItem
#'
#' @description CatalogsCreativeAssetsBatchItem Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsCreativeAssetsBatchItem <- R6::R6Class(
  "CatalogsCreativeAssetsBatchItem",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("CatalogsCreateCreativeAssetsItem", "CatalogsDeleteCreativeAssetsItem", "CatalogsUpdateCreativeAssetsItem", "CatalogsUpsertCreativeAssetsItem"),

    #' @description
    #' Initialize a new CatalogsCreativeAssetsBatchItem.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "CatalogsCreateCreativeAssetsItem", "CatalogsDeleteCreativeAssetsItem", "CatalogsUpdateCreativeAssetsItem", "CatalogsUpsertCreativeAssetsItem"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsCreateCreativeAssetsItem") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsCreateCreativeAssetsItem"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsDeleteCreativeAssetsItem") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsDeleteCreativeAssetsItem"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsUpdateCreativeAssetsItem") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsUpdateCreativeAssetsItem"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsUpsertCreativeAssetsItem") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsUpsertCreativeAssetsItem"
      } else {
        stop(paste("Failed to initialize CatalogsCreativeAssetsBatchItem with oneOf schemas CatalogsCreateCreativeAssetsItem, CatalogsDeleteCreativeAssetsItem, CatalogsUpdateCreativeAssetsItem, CatalogsUpsertCreativeAssetsItem. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsCreativeAssetsBatchItem.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsCreativeAssetsBatchItem.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsCreativeAssetsBatchItem.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsCreativeAssetsBatchItem.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `CatalogsCreateCreativeAssetsItem_result` <- tryCatch({
          `CatalogsCreateCreativeAssetsItem`$public_methods$validateJSON(input)
          `CatalogsCreateCreativeAssetsItem_instance` <- `CatalogsCreateCreativeAssetsItem`$new()
          instance <- `CatalogsCreateCreativeAssetsItem_instance`$fromJSON(input)
          instance_type <- "CatalogsCreateCreativeAssetsItem"
          matched_schemas <- append(matched_schemas, "CatalogsCreateCreativeAssetsItem")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsCreateCreativeAssetsItem_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsCreateCreativeAssetsItem_result`["message"])
      }

      `CatalogsUpsertCreativeAssetsItem_result` <- tryCatch({
          `CatalogsUpsertCreativeAssetsItem`$public_methods$validateJSON(input)
          `CatalogsUpsertCreativeAssetsItem_instance` <- `CatalogsUpsertCreativeAssetsItem`$new()
          instance <- `CatalogsUpsertCreativeAssetsItem_instance`$fromJSON(input)
          instance_type <- "CatalogsUpsertCreativeAssetsItem"
          matched_schemas <- append(matched_schemas, "CatalogsUpsertCreativeAssetsItem")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsUpsertCreativeAssetsItem_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsUpsertCreativeAssetsItem_result`["message"])
      }

      `CatalogsUpdateCreativeAssetsItem_result` <- tryCatch({
          `CatalogsUpdateCreativeAssetsItem`$public_methods$validateJSON(input)
          `CatalogsUpdateCreativeAssetsItem_instance` <- `CatalogsUpdateCreativeAssetsItem`$new()
          instance <- `CatalogsUpdateCreativeAssetsItem_instance`$fromJSON(input)
          instance_type <- "CatalogsUpdateCreativeAssetsItem"
          matched_schemas <- append(matched_schemas, "CatalogsUpdateCreativeAssetsItem")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsUpdateCreativeAssetsItem_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsUpdateCreativeAssetsItem_result`["message"])
      }

      `CatalogsDeleteCreativeAssetsItem_result` <- tryCatch({
          `CatalogsDeleteCreativeAssetsItem`$public_methods$validateJSON(input)
          `CatalogsDeleteCreativeAssetsItem_instance` <- `CatalogsDeleteCreativeAssetsItem`$new()
          instance <- `CatalogsDeleteCreativeAssetsItem_instance`$fromJSON(input)
          instance_type <- "CatalogsDeleteCreativeAssetsItem"
          matched_schemas <- append(matched_schemas, "CatalogsDeleteCreativeAssetsItem")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsDeleteCreativeAssetsItem_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsDeleteCreativeAssetsItem_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into CatalogsCreativeAssetsBatchItem with oneOf schemas CatalogsCreateCreativeAssetsItem, CatalogsDeleteCreativeAssetsItem, CatalogsUpdateCreativeAssetsItem, CatalogsUpsertCreativeAssetsItem. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into CatalogsCreativeAssetsBatchItem with oneOf schemas CatalogsCreateCreativeAssetsItem, CatalogsDeleteCreativeAssetsItem, CatalogsUpdateCreativeAssetsItem, CatalogsUpsertCreativeAssetsItem. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize CatalogsCreativeAssetsBatchItem to JSON string.
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return JSON string representation of the CatalogsCreativeAssetsBatchItem.
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
    #' Convert CatalogsCreativeAssetsBatchItem to a base R type
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
    #' Validate the input JSON with respect to CatalogsCreativeAssetsBatchItem and
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
#CatalogsCreativeAssetsBatchItem$unlock()
#
## Below is an example to define the print function
#CatalogsCreativeAssetsBatchItem$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#CatalogsCreativeAssetsBatchItem$lock()

