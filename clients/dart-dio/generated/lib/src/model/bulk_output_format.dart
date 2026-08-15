//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bulk_output_format.g.dart';

class BulkOutputFormat extends EnumClass {

  /// Bulk file output format
  @BuiltValueEnumConst(wireName: r'CSV')
  static const BulkOutputFormat CSV = _$CSV;
  /// Bulk file output format
  @BuiltValueEnumConst(wireName: r'JSON')
  static const BulkOutputFormat JSON = _$JSON;

  static Serializer<BulkOutputFormat> get serializer => _$bulkOutputFormatSerializer;

  const BulkOutputFormat._(String name): super(name);

  static BuiltSet<BulkOutputFormat> get values => _$values;
  static BulkOutputFormat valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class BulkOutputFormatMixin = Object with _$BulkOutputFormatMixin;

