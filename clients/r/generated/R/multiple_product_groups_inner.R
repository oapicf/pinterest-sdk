#' @docType class
#' @title MultipleProductGroupsInner
#'
#' @description MultipleProductGroupsInner Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MultipleProductGroupsInner <- R6::R6Class(
  "MultipleProductGroupsInner",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("CatalogsProductGroupCreateRequest", "CatalogsVerticalProductGroupCreateRequest"),

    #' @description
    #' Initialize a new MultipleProductGroupsInner.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "CatalogsProductGroupCreateRequest", "CatalogsVerticalProductGroupCreateRequest"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsProductGroupCreateRequest") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsProductGroupCreateRequest"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsVerticalProductGroupCreateRequest") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsVerticalProductGroupCreateRequest"
      } else {
        stop(paste("Failed to initialize MultipleProductGroupsInner with oneOf schemas CatalogsProductGroupCreateRequest, CatalogsVerticalProductGroupCreateRequest. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of MultipleProductGroupsInner.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of MultipleProductGroupsInner.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of MultipleProductGroupsInner.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of MultipleProductGroupsInner.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `CatalogsProductGroupCreateRequest_result` <- tryCatch({
          `CatalogsProductGroupCreateRequest`$public_methods$validateJSON(input)
          `CatalogsProductGroupCreateRequest_instance` <- `CatalogsProductGroupCreateRequest`$new()
          instance <- `CatalogsProductGroupCreateRequest_instance`$fromJSON(input)
          instance_type <- "CatalogsProductGroupCreateRequest"
          matched_schemas <- append(matched_schemas, "CatalogsProductGroupCreateRequest")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsProductGroupCreateRequest_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsProductGroupCreateRequest_result`["message"])
      }

      `CatalogsVerticalProductGroupCreateRequest_result` <- tryCatch({
          `CatalogsVerticalProductGroupCreateRequest`$public_methods$validateJSON(input)
          `CatalogsVerticalProductGroupCreateRequest_instance` <- `CatalogsVerticalProductGroupCreateRequest`$new()
          instance <- `CatalogsVerticalProductGroupCreateRequest_instance`$fromJSON(input)
          instance_type <- "CatalogsVerticalProductGroupCreateRequest"
          matched_schemas <- append(matched_schemas, "CatalogsVerticalProductGroupCreateRequest")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsVerticalProductGroupCreateRequest_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsVerticalProductGroupCreateRequest_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into MultipleProductGroupsInner with oneOf schemas CatalogsProductGroupCreateRequest, CatalogsVerticalProductGroupCreateRequest. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into MultipleProductGroupsInner with oneOf schemas CatalogsProductGroupCreateRequest, CatalogsVerticalProductGroupCreateRequest. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize MultipleProductGroupsInner to JSON string.
    #'
    #' @return JSON string representation of the MultipleProductGroupsInner.
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify(self$actual_instance$toJSONString()))
      } else {
        NULL
      }
    },

    #' @description
    #' Serialize MultipleProductGroupsInner to JSON.
    #'
    #' @return JSON representation of the MultipleProductGroupsInner.
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },

    #' @description
    #' Validate the input JSON with respect to MultipleProductGroupsInner and
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
#MultipleProductGroupsInner$unlock()
#
## Below is an example to define the print function
#MultipleProductGroupsInner$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#MultipleProductGroupsInner$lock()

