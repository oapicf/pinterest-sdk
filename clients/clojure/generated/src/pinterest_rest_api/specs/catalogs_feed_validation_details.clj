(ns pinterest-rest-api.specs.catalogs-feed-validation-details
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-feed-validation-errors :refer :all]
            [pinterest-rest-api.specs.catalogs-feed-validation-warnings :refer :all]
            )
  (:import (java.io File)))


(def catalogs-feed-validation-details-data
  {
   (ds/req :errors) catalogs-feed-validation-errors-spec
   (ds/req :warnings) catalogs-feed-validation-warnings-spec
   })

(def catalogs-feed-validation-details-spec
  (ds/spec
    {:name ::catalogs-feed-validation-details
     :spec catalogs-feed-validation-details-data}))
