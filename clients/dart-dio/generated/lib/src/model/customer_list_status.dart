//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'customer_list_status.g.dart';

class CustomerListStatus extends EnumClass {

  /// Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.
  @BuiltValueEnumConst(wireName: r'PROCESSING')
  static const CustomerListStatus PROCESSING = _$PROCESSING;
  /// Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.
  @BuiltValueEnumConst(wireName: r'READY')
  static const CustomerListStatus READY = _$READY;
  /// Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.
  @BuiltValueEnumConst(wireName: r'TOO_SMALL')
  static const CustomerListStatus TOO_SMALL = _$TOO_SMALL;
  /// Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.
  @BuiltValueEnumConst(wireName: r'UPLOADING')
  static const CustomerListStatus UPLOADING = _$UPLOADING;

  static Serializer<CustomerListStatus> get serializer => _$customerListStatusSerializer;

  const CustomerListStatus._(String name): super(name);

  static BuiltSet<CustomerListStatus> get values => _$values;
  static CustomerListStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class CustomerListStatusMixin = Object with _$CustomerListStatusMixin;

