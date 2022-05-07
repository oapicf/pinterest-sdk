(ns pinterest-rest-api.specs.catalogs-feed-processing-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-feed-processing-status-data
  {
   })

(def catalogs-feed-processing-status-spec
  (ds/spec
    {:name ::catalogs-feed-processing-status
     :spec catalogs-feed-processing-status-data}))
