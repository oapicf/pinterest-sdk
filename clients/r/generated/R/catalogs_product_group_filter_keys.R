#' @docType class
#' @title CatalogsProductGroupFilterKeys
#'
#' @description CatalogsProductGroupFilterKeys Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsProductGroupFilterKeys <- R6::R6Class(
  "CatalogsProductGroupFilterKeys",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field any_of  a list of object types defined in the anyOf schema.
    any_of = list("AvailabilityFilter", "BrandFilter", "ConditionFilter", "CurrencyFilter", "CustomLabel0Filter", "CustomLabel1Filter", "CustomLabel2Filter", "CustomLabel3Filter", "CustomLabel4Filter", "GenderFilter", "GoogleProductCategory0Filter", "GoogleProductCategory1Filter", "GoogleProductCategory2Filter", "GoogleProductCategory3Filter", "GoogleProductCategory4Filter", "GoogleProductCategory5Filter", "GoogleProductCategory6Filter", "ItemGroupIdFilter", "ItemIdFilter", "MaxPriceFilter", "MinPriceFilter", "ProductType0Filter", "ProductType1Filter", "ProductType2Filter", "ProductType3Filter", "ProductType4Filter"),
    #' Initialize a new CatalogsProductGroupFilterKeys.
    #'
    #' @description
    #' Initialize a new CatalogsProductGroupFilterKeys.
    #'
    #' @param instance an instance of the object defined in the anyOf schemas: "AvailabilityFilter", "BrandFilter", "ConditionFilter", "CurrencyFilter", "CustomLabel0Filter", "CustomLabel1Filter", "CustomLabel2Filter", "CustomLabel3Filter", "CustomLabel4Filter", "GenderFilter", "GoogleProductCategory0Filter", "GoogleProductCategory1Filter", "GoogleProductCategory2Filter", "GoogleProductCategory3Filter", "GoogleProductCategory4Filter", "GoogleProductCategory5Filter", "GoogleProductCategory6Filter", "ItemGroupIdFilter", "ItemIdFilter", "MaxPriceFilter", "MinPriceFilter", "ProductType0Filter", "ProductType1Filter", "ProductType2Filter", "ProductType3Filter", "ProductType4Filter"
    #' @export
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "AvailabilityFilter") {
        self$actual_instance <- instance
        self$actual_type <- "AvailabilityFilter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "BrandFilter") {
        self$actual_instance <- instance
        self$actual_type <- "BrandFilter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "ConditionFilter") {
        self$actual_instance <- instance
        self$actual_type <- "ConditionFilter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CurrencyFilter") {
        self$actual_instance <- instance
        self$actual_type <- "CurrencyFilter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CustomLabel0Filter") {
        self$actual_instance <- instance
        self$actual_type <- "CustomLabel0Filter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CustomLabel1Filter") {
        self$actual_instance <- instance
        self$actual_type <- "CustomLabel1Filter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CustomLabel2Filter") {
        self$actual_instance <- instance
        self$actual_type <- "CustomLabel2Filter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CustomLabel3Filter") {
        self$actual_instance <- instance
        self$actual_type <- "CustomLabel3Filter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CustomLabel4Filter") {
        self$actual_instance <- instance
        self$actual_type <- "CustomLabel4Filter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "GenderFilter") {
        self$actual_instance <- instance
        self$actual_type <- "GenderFilter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "GoogleProductCategory0Filter") {
        self$actual_instance <- instance
        self$actual_type <- "GoogleProductCategory0Filter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "GoogleProductCategory1Filter") {
        self$actual_instance <- instance
        self$actual_type <- "GoogleProductCategory1Filter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "GoogleProductCategory2Filter") {
        self$actual_instance <- instance
        self$actual_type <- "GoogleProductCategory2Filter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "GoogleProductCategory3Filter") {
        self$actual_instance <- instance
        self$actual_type <- "GoogleProductCategory3Filter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "GoogleProductCategory4Filter") {
        self$actual_instance <- instance
        self$actual_type <- "GoogleProductCategory4Filter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "GoogleProductCategory5Filter") {
        self$actual_instance <- instance
        self$actual_type <- "GoogleProductCategory5Filter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "GoogleProductCategory6Filter") {
        self$actual_instance <- instance
        self$actual_type <- "GoogleProductCategory6Filter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "ItemGroupIdFilter") {
        self$actual_instance <- instance
        self$actual_type <- "ItemGroupIdFilter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "ItemIdFilter") {
        self$actual_instance <- instance
        self$actual_type <- "ItemIdFilter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "MaxPriceFilter") {
        self$actual_instance <- instance
        self$actual_type <- "MaxPriceFilter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "MinPriceFilter") {
        self$actual_instance <- instance
        self$actual_type <- "MinPriceFilter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "ProductType0Filter") {
        self$actual_instance <- instance
        self$actual_type <- "ProductType0Filter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "ProductType1Filter") {
        self$actual_instance <- instance
        self$actual_type <- "ProductType1Filter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "ProductType2Filter") {
        self$actual_instance <- instance
        self$actual_type <- "ProductType2Filter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "ProductType3Filter") {
        self$actual_instance <- instance
        self$actual_type <- "ProductType3Filter"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "ProductType4Filter") {
        self$actual_instance <- instance
        self$actual_type <- "ProductType4Filter"
      } else {
        stop(paste("Failed to initialize CatalogsProductGroupFilterKeys with anyOf schemas AvailabilityFilter, BrandFilter, ConditionFilter, CurrencyFilter, CustomLabel0Filter, CustomLabel1Filter, CustomLabel2Filter, CustomLabel3Filter, CustomLabel4Filter, GenderFilter, GoogleProductCategory0Filter, GoogleProductCategory1Filter, GoogleProductCategory2Filter, GoogleProductCategory3Filter, GoogleProductCategory4Filter, GoogleProductCategory5Filter, GoogleProductCategory6Filter, ItemGroupIdFilter, ItemIdFilter, MaxPriceFilter, MinPriceFilter, ProductType0Filter, ProductType1Filter, ProductType2Filter, ProductType3Filter, ProductType4Filter. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },
    #' Deserialize JSON string into an instance of CatalogsProductGroupFilterKeys.
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupFilterKeys.
    #' An alias to the method `fromJSON`.
    #'
    #' @param input The input JSON.
    #' @return An instance of CatalogsProductGroupFilterKeys.
    #' @export
    fromJSONString = function(input) {
      self$fromJSON(input)
    },
    #' Deserialize JSON string into an instance of CatalogsProductGroupFilterKeys.
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupFilterKeys.
    #'
    #' @param input The input JSON.
    #' @return An instance of CatalogsProductGroupFilterKeys.
    #' @export
    fromJSON = function(input) {
      error_messages <- list()

      `MinPriceFilter_result` <- tryCatch({
          `MinPriceFilter`$public_methods$validateJSON(input)
          `MinPriceFilter_instance` <- `MinPriceFilter`$new()
          self$actual_instance <- `MinPriceFilter_instance`$fromJSON(input)
          self$actual_type <- "MinPriceFilter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`MinPriceFilter_result`["error"])) {
        error_messages <- append(error_messages, `MinPriceFilter_result`["message"])
      }

      `MaxPriceFilter_result` <- tryCatch({
          `MaxPriceFilter`$public_methods$validateJSON(input)
          `MaxPriceFilter_instance` <- `MaxPriceFilter`$new()
          self$actual_instance <- `MaxPriceFilter_instance`$fromJSON(input)
          self$actual_type <- "MaxPriceFilter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`MaxPriceFilter_result`["error"])) {
        error_messages <- append(error_messages, `MaxPriceFilter_result`["message"])
      }

      `CurrencyFilter_result` <- tryCatch({
          `CurrencyFilter`$public_methods$validateJSON(input)
          `CurrencyFilter_instance` <- `CurrencyFilter`$new()
          self$actual_instance <- `CurrencyFilter_instance`$fromJSON(input)
          self$actual_type <- "CurrencyFilter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`CurrencyFilter_result`["error"])) {
        error_messages <- append(error_messages, `CurrencyFilter_result`["message"])
      }

      `ItemIdFilter_result` <- tryCatch({
          `ItemIdFilter`$public_methods$validateJSON(input)
          `ItemIdFilter_instance` <- `ItemIdFilter`$new()
          self$actual_instance <- `ItemIdFilter_instance`$fromJSON(input)
          self$actual_type <- "ItemIdFilter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`ItemIdFilter_result`["error"])) {
        error_messages <- append(error_messages, `ItemIdFilter_result`["message"])
      }

      `AvailabilityFilter_result` <- tryCatch({
          `AvailabilityFilter`$public_methods$validateJSON(input)
          `AvailabilityFilter_instance` <- `AvailabilityFilter`$new()
          self$actual_instance <- `AvailabilityFilter_instance`$fromJSON(input)
          self$actual_type <- "AvailabilityFilter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`AvailabilityFilter_result`["error"])) {
        error_messages <- append(error_messages, `AvailabilityFilter_result`["message"])
      }

      `BrandFilter_result` <- tryCatch({
          `BrandFilter`$public_methods$validateJSON(input)
          `BrandFilter_instance` <- `BrandFilter`$new()
          self$actual_instance <- `BrandFilter_instance`$fromJSON(input)
          self$actual_type <- "BrandFilter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`BrandFilter_result`["error"])) {
        error_messages <- append(error_messages, `BrandFilter_result`["message"])
      }

      `ConditionFilter_result` <- tryCatch({
          `ConditionFilter`$public_methods$validateJSON(input)
          `ConditionFilter_instance` <- `ConditionFilter`$new()
          self$actual_instance <- `ConditionFilter_instance`$fromJSON(input)
          self$actual_type <- "ConditionFilter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`ConditionFilter_result`["error"])) {
        error_messages <- append(error_messages, `ConditionFilter_result`["message"])
      }

      `CustomLabel0Filter_result` <- tryCatch({
          `CustomLabel0Filter`$public_methods$validateJSON(input)
          `CustomLabel0Filter_instance` <- `CustomLabel0Filter`$new()
          self$actual_instance <- `CustomLabel0Filter_instance`$fromJSON(input)
          self$actual_type <- "CustomLabel0Filter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`CustomLabel0Filter_result`["error"])) {
        error_messages <- append(error_messages, `CustomLabel0Filter_result`["message"])
      }

      `CustomLabel1Filter_result` <- tryCatch({
          `CustomLabel1Filter`$public_methods$validateJSON(input)
          `CustomLabel1Filter_instance` <- `CustomLabel1Filter`$new()
          self$actual_instance <- `CustomLabel1Filter_instance`$fromJSON(input)
          self$actual_type <- "CustomLabel1Filter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`CustomLabel1Filter_result`["error"])) {
        error_messages <- append(error_messages, `CustomLabel1Filter_result`["message"])
      }

      `CustomLabel2Filter_result` <- tryCatch({
          `CustomLabel2Filter`$public_methods$validateJSON(input)
          `CustomLabel2Filter_instance` <- `CustomLabel2Filter`$new()
          self$actual_instance <- `CustomLabel2Filter_instance`$fromJSON(input)
          self$actual_type <- "CustomLabel2Filter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`CustomLabel2Filter_result`["error"])) {
        error_messages <- append(error_messages, `CustomLabel2Filter_result`["message"])
      }

      `CustomLabel3Filter_result` <- tryCatch({
          `CustomLabel3Filter`$public_methods$validateJSON(input)
          `CustomLabel3Filter_instance` <- `CustomLabel3Filter`$new()
          self$actual_instance <- `CustomLabel3Filter_instance`$fromJSON(input)
          self$actual_type <- "CustomLabel3Filter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`CustomLabel3Filter_result`["error"])) {
        error_messages <- append(error_messages, `CustomLabel3Filter_result`["message"])
      }

      `CustomLabel4Filter_result` <- tryCatch({
          `CustomLabel4Filter`$public_methods$validateJSON(input)
          `CustomLabel4Filter_instance` <- `CustomLabel4Filter`$new()
          self$actual_instance <- `CustomLabel4Filter_instance`$fromJSON(input)
          self$actual_type <- "CustomLabel4Filter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`CustomLabel4Filter_result`["error"])) {
        error_messages <- append(error_messages, `CustomLabel4Filter_result`["message"])
      }

      `ItemGroupIdFilter_result` <- tryCatch({
          `ItemGroupIdFilter`$public_methods$validateJSON(input)
          `ItemGroupIdFilter_instance` <- `ItemGroupIdFilter`$new()
          self$actual_instance <- `ItemGroupIdFilter_instance`$fromJSON(input)
          self$actual_type <- "ItemGroupIdFilter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`ItemGroupIdFilter_result`["error"])) {
        error_messages <- append(error_messages, `ItemGroupIdFilter_result`["message"])
      }

      `GenderFilter_result` <- tryCatch({
          `GenderFilter`$public_methods$validateJSON(input)
          `GenderFilter_instance` <- `GenderFilter`$new()
          self$actual_instance <- `GenderFilter_instance`$fromJSON(input)
          self$actual_type <- "GenderFilter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`GenderFilter_result`["error"])) {
        error_messages <- append(error_messages, `GenderFilter_result`["message"])
      }

      `ProductType4Filter_result` <- tryCatch({
          `ProductType4Filter`$public_methods$validateJSON(input)
          `ProductType4Filter_instance` <- `ProductType4Filter`$new()
          self$actual_instance <- `ProductType4Filter_instance`$fromJSON(input)
          self$actual_type <- "ProductType4Filter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`ProductType4Filter_result`["error"])) {
        error_messages <- append(error_messages, `ProductType4Filter_result`["message"])
      }

      `ProductType3Filter_result` <- tryCatch({
          `ProductType3Filter`$public_methods$validateJSON(input)
          `ProductType3Filter_instance` <- `ProductType3Filter`$new()
          self$actual_instance <- `ProductType3Filter_instance`$fromJSON(input)
          self$actual_type <- "ProductType3Filter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`ProductType3Filter_result`["error"])) {
        error_messages <- append(error_messages, `ProductType3Filter_result`["message"])
      }

      `ProductType2Filter_result` <- tryCatch({
          `ProductType2Filter`$public_methods$validateJSON(input)
          `ProductType2Filter_instance` <- `ProductType2Filter`$new()
          self$actual_instance <- `ProductType2Filter_instance`$fromJSON(input)
          self$actual_type <- "ProductType2Filter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`ProductType2Filter_result`["error"])) {
        error_messages <- append(error_messages, `ProductType2Filter_result`["message"])
      }

      `ProductType1Filter_result` <- tryCatch({
          `ProductType1Filter`$public_methods$validateJSON(input)
          `ProductType1Filter_instance` <- `ProductType1Filter`$new()
          self$actual_instance <- `ProductType1Filter_instance`$fromJSON(input)
          self$actual_type <- "ProductType1Filter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`ProductType1Filter_result`["error"])) {
        error_messages <- append(error_messages, `ProductType1Filter_result`["message"])
      }

      `ProductType0Filter_result` <- tryCatch({
          `ProductType0Filter`$public_methods$validateJSON(input)
          `ProductType0Filter_instance` <- `ProductType0Filter`$new()
          self$actual_instance <- `ProductType0Filter_instance`$fromJSON(input)
          self$actual_type <- "ProductType0Filter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`ProductType0Filter_result`["error"])) {
        error_messages <- append(error_messages, `ProductType0Filter_result`["message"])
      }

      `GoogleProductCategory6Filter_result` <- tryCatch({
          `GoogleProductCategory6Filter`$public_methods$validateJSON(input)
          `GoogleProductCategory6Filter_instance` <- `GoogleProductCategory6Filter`$new()
          self$actual_instance <- `GoogleProductCategory6Filter_instance`$fromJSON(input)
          self$actual_type <- "GoogleProductCategory6Filter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`GoogleProductCategory6Filter_result`["error"])) {
        error_messages <- append(error_messages, `GoogleProductCategory6Filter_result`["message"])
      }

      `GoogleProductCategory5Filter_result` <- tryCatch({
          `GoogleProductCategory5Filter`$public_methods$validateJSON(input)
          `GoogleProductCategory5Filter_instance` <- `GoogleProductCategory5Filter`$new()
          self$actual_instance <- `GoogleProductCategory5Filter_instance`$fromJSON(input)
          self$actual_type <- "GoogleProductCategory5Filter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`GoogleProductCategory5Filter_result`["error"])) {
        error_messages <- append(error_messages, `GoogleProductCategory5Filter_result`["message"])
      }

      `GoogleProductCategory4Filter_result` <- tryCatch({
          `GoogleProductCategory4Filter`$public_methods$validateJSON(input)
          `GoogleProductCategory4Filter_instance` <- `GoogleProductCategory4Filter`$new()
          self$actual_instance <- `GoogleProductCategory4Filter_instance`$fromJSON(input)
          self$actual_type <- "GoogleProductCategory4Filter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`GoogleProductCategory4Filter_result`["error"])) {
        error_messages <- append(error_messages, `GoogleProductCategory4Filter_result`["message"])
      }

      `GoogleProductCategory3Filter_result` <- tryCatch({
          `GoogleProductCategory3Filter`$public_methods$validateJSON(input)
          `GoogleProductCategory3Filter_instance` <- `GoogleProductCategory3Filter`$new()
          self$actual_instance <- `GoogleProductCategory3Filter_instance`$fromJSON(input)
          self$actual_type <- "GoogleProductCategory3Filter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`GoogleProductCategory3Filter_result`["error"])) {
        error_messages <- append(error_messages, `GoogleProductCategory3Filter_result`["message"])
      }

      `GoogleProductCategory2Filter_result` <- tryCatch({
          `GoogleProductCategory2Filter`$public_methods$validateJSON(input)
          `GoogleProductCategory2Filter_instance` <- `GoogleProductCategory2Filter`$new()
          self$actual_instance <- `GoogleProductCategory2Filter_instance`$fromJSON(input)
          self$actual_type <- "GoogleProductCategory2Filter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`GoogleProductCategory2Filter_result`["error"])) {
        error_messages <- append(error_messages, `GoogleProductCategory2Filter_result`["message"])
      }

      `GoogleProductCategory1Filter_result` <- tryCatch({
          `GoogleProductCategory1Filter`$public_methods$validateJSON(input)
          `GoogleProductCategory1Filter_instance` <- `GoogleProductCategory1Filter`$new()
          self$actual_instance <- `GoogleProductCategory1Filter_instance`$fromJSON(input)
          self$actual_type <- "GoogleProductCategory1Filter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`GoogleProductCategory1Filter_result`["error"])) {
        error_messages <- append(error_messages, `GoogleProductCategory1Filter_result`["message"])
      }

      `GoogleProductCategory0Filter_result` <- tryCatch({
          `GoogleProductCategory0Filter`$public_methods$validateJSON(input)
          `GoogleProductCategory0Filter_instance` <- `GoogleProductCategory0Filter`$new()
          self$actual_instance <- `GoogleProductCategory0Filter_instance`$fromJSON(input)
          self$actual_type <- "GoogleProductCategory0Filter"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`GoogleProductCategory0Filter_result`["error"])) {
        error_messages <- append(error_messages, `GoogleProductCategory0Filter_result`["message"])
      }

      # no match
      stop(paste("No match found when deserializing the input into CatalogsProductGroupFilterKeys with anyOf schemas AvailabilityFilter, BrandFilter, ConditionFilter, CurrencyFilter, CustomLabel0Filter, CustomLabel1Filter, CustomLabel2Filter, CustomLabel3Filter, CustomLabel4Filter, GenderFilter, GoogleProductCategory0Filter, GoogleProductCategory1Filter, GoogleProductCategory2Filter, GoogleProductCategory3Filter, GoogleProductCategory4Filter, GoogleProductCategory5Filter, GoogleProductCategory6Filter, ItemGroupIdFilter, ItemIdFilter, MaxPriceFilter, MinPriceFilter, ProductType0Filter, ProductType1Filter, ProductType2Filter, ProductType3Filter, ProductType4Filter. Details: >>",
                 paste(error_messages, collapse = " >> ")))
    },
    #' Serialize CatalogsProductGroupFilterKeys to JSON string.
    #'
    #' @description
    #' Serialize CatalogsProductGroupFilterKeys to JSON string.
    #'
    #' @return JSON string representation of the CatalogsProductGroupFilterKeys.
    #' @export
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify((self$actual_instance$toJSONString())))
      } else {
        NULL
      }
    },
    #' Serialize CatalogsProductGroupFilterKeys to JSON.
    #'
    #' @description
    #' Serialize CatalogsProductGroupFilterKeys to JSON.
    #'
    #' @return JSON representation of the CatalogsProductGroupFilterKeys.
    #' @export
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },
    #' Validate the input JSON with respect to CatalogsProductGroupFilterKeys.
    #'
    #' @description
    #' Validate the input JSON with respect to CatalogsProductGroupFilterKeys and
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
#CatalogsProductGroupFilterKeys$unlock()
#
## Below is an example to define the print function
#CatalogsProductGroupFilterKeys$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#CatalogsProductGroupFilterKeys$lock()

