//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'data_output_format.g.dart';

class DataOutputFormat extends EnumClass {

  /// Format of generated report
  @BuiltValueEnumConst(wireName: r'JSON')
  static const DataOutputFormat JSON = _$JSON;
  /// Format of generated report
  @BuiltValueEnumConst(wireName: r'CSV')
  static const DataOutputFormat CSV = _$CSV;

  static Serializer<DataOutputFormat> get serializer => _$dataOutputFormatSerializer;

  const DataOutputFormat._(String name): super(name);

  static BuiltSet<DataOutputFormat> get values => _$values;
  static DataOutputFormat valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class DataOutputFormatMixin = Object with _$DataOutputFormatMixin;

