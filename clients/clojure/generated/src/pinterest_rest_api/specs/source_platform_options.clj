(ns pinterest-rest-api.specs.source-platform-options
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def source-platform-options-data
  {
   })

(def source-platform-options-spec
  (ds/spec
    {:name ::source-platform-options
     :spec source-platform-options-data}))
