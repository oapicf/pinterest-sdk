//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bulk_request_status.g.dart';

class BulkRequestStatus extends EnumClass {

  /// Bulk request status
  @BuiltValueEnumConst(wireName: r'RUNNING')
  static const BulkRequestStatus RUNNING = _$RUNNING;
  /// Bulk request status
  @BuiltValueEnumConst(wireName: r'SUCCEEDED')
  static const BulkRequestStatus SUCCEEDED = _$SUCCEEDED;
  /// Bulk request status
  @BuiltValueEnumConst(wireName: r'FAILED')
  static const BulkRequestStatus FAILED = _$FAILED;

  static Serializer<BulkRequestStatus> get serializer => _$bulkRequestStatusSerializer;

  const BulkRequestStatus._(String name): super(name);

  static BuiltSet<BulkRequestStatus> get values => _$values;
  static BulkRequestStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class BulkRequestStatusMixin = Object with _$BulkRequestStatusMixin;

