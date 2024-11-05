#' @docType class
#' @title CatalogsProduct
#'
#' @description CatalogsProduct Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsProduct <- R6::R6Class(
  "CatalogsProduct",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("CatalogsCreativeAssetsProduct", "CatalogsHotelProduct", "CatalogsRetailProduct"),

    #' @description
    #' Initialize a new CatalogsProduct.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "CatalogsCreativeAssetsProduct", "CatalogsHotelProduct", "CatalogsRetailProduct"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsCreativeAssetsProduct") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsCreativeAssetsProduct"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsHotelProduct") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsHotelProduct"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CatalogsRetailProduct") {
        self$actual_instance <- instance
        self$actual_type <- "CatalogsRetailProduct"
      } else {
        stop(paste("Failed to initialize CatalogsProduct with oneOf schemas CatalogsCreativeAssetsProduct, CatalogsHotelProduct, CatalogsRetailProduct. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsProduct.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsProduct.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsProduct.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CatalogsProduct.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `CatalogsRetailProduct_result` <- tryCatch({
          `CatalogsRetailProduct`$public_methods$validateJSON(input)
          `CatalogsRetailProduct_instance` <- `CatalogsRetailProduct`$new()
          instance <- `CatalogsRetailProduct_instance`$fromJSON(input)
          instance_type <- "CatalogsRetailProduct"
          matched_schemas <- append(matched_schemas, "CatalogsRetailProduct")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsRetailProduct_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsRetailProduct_result`["message"])
      }

      `CatalogsHotelProduct_result` <- tryCatch({
          `CatalogsHotelProduct`$public_methods$validateJSON(input)
          `CatalogsHotelProduct_instance` <- `CatalogsHotelProduct`$new()
          instance <- `CatalogsHotelProduct_instance`$fromJSON(input)
          instance_type <- "CatalogsHotelProduct"
          matched_schemas <- append(matched_schemas, "CatalogsHotelProduct")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsHotelProduct_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsHotelProduct_result`["message"])
      }

      `CatalogsCreativeAssetsProduct_result` <- tryCatch({
          `CatalogsCreativeAssetsProduct`$public_methods$validateJSON(input)
          `CatalogsCreativeAssetsProduct_instance` <- `CatalogsCreativeAssetsProduct`$new()
          instance <- `CatalogsCreativeAssetsProduct_instance`$fromJSON(input)
          instance_type <- "CatalogsCreativeAssetsProduct"
          matched_schemas <- append(matched_schemas, "CatalogsCreativeAssetsProduct")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CatalogsCreativeAssetsProduct_result`["error"])) {
        error_messages <- append(error_messages, `CatalogsCreativeAssetsProduct_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into CatalogsProduct with oneOf schemas CatalogsCreativeAssetsProduct, CatalogsHotelProduct, CatalogsRetailProduct. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into CatalogsProduct with oneOf schemas CatalogsCreativeAssetsProduct, CatalogsHotelProduct, CatalogsRetailProduct. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize CatalogsProduct to JSON string.
    #'
    #' @return JSON string representation of the CatalogsProduct.
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify(self$actual_instance$toJSONString()))
      } else {
        NULL
      }
    },

    #' @description
    #' Serialize CatalogsProduct to JSON.
    #'
    #' @return JSON representation of the CatalogsProduct.
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },

    #' @description
    #' Validate the input JSON with respect to CatalogsProduct and
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
#CatalogsProduct$unlock()
#
## Below is an example to define the print function
#CatalogsProduct$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#CatalogsProduct$lock()

