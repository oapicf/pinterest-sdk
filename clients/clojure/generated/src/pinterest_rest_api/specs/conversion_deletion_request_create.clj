(ns pinterest-rest-api.specs.conversion-deletion-request-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.conversion-deletion-request-targets :refer :all]
            )
  (:import (java.io File)))


(def conversion-deletion-request-create-data
  {
   (ds/req :deletion_targets) conversion-deletion-request-targets-spec
   })

(def conversion-deletion-request-create-spec
  (ds/spec
    {:name ::conversion-deletion-request-create
     :spec conversion-deletion-request-create-data}))
