//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ingestion_source_options.g.dart';

class IngestionSourceOptions extends EnumClass {

  /// List of ingestion sources for a conversion event.
  @BuiltValueEnumConst(wireName: r'TAG')
  static const IngestionSourceOptions TAG = _$TAG;
  /// List of ingestion sources for a conversion event.
  @BuiltValueEnumConst(wireName: r'MMP')
  static const IngestionSourceOptions MMP = _$MMP;
  /// List of ingestion sources for a conversion event.
  @BuiltValueEnumConst(wireName: r'FILE_UPLOAD')
  static const IngestionSourceOptions FILE_UPLOAD = _$FILE_UPLOAD;
  /// List of ingestion sources for a conversion event.
  @BuiltValueEnumConst(wireName: r'CONVERSIONS_API')
  static const IngestionSourceOptions CONVERSIONS_API = _$CONVERSIONS_API;
  /// List of ingestion sources for a conversion event.
  @BuiltValueEnumConst(wireName: r'NATIVE')
  static const IngestionSourceOptions NATIVE = _$NATIVE;

  static Serializer<IngestionSourceOptions> get serializer => _$ingestionSourceOptionsSerializer;

  const IngestionSourceOptions._(String name): super(name);

  static BuiltSet<IngestionSourceOptions> get values => _$values;
  static IngestionSourceOptions valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class IngestionSourceOptionsMixin = Object with _$IngestionSourceOptionsMixin;

