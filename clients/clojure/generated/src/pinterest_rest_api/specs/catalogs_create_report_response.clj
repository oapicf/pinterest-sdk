(ns pinterest-rest-api.specs.catalogs-create-report-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-create-report-response-data
  {
   (ds/opt :token) string?
   })

(def catalogs-create-report-response-spec
  (ds/spec
    {:name ::catalogs-create-report-response
     :spec catalogs-create-report-response-data}))
